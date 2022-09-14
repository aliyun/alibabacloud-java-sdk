// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetTagsBySwimmingLaneGroupIdRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("MseSessionId")
    public String mseSessionId;

    public static GetTagsBySwimmingLaneGroupIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTagsBySwimmingLaneGroupIdRequest self = new GetTagsBySwimmingLaneGroupIdRequest();
        return TeaModel.build(map, self);
    }

    public GetTagsBySwimmingLaneGroupIdRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public GetTagsBySwimmingLaneGroupIdRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public GetTagsBySwimmingLaneGroupIdRequest setMseSessionId(String mseSessionId) {
        this.mseSessionId = mseSessionId;
        return this;
    }
    public String getMseSessionId() {
        return this.mseSessionId;
    }

}
