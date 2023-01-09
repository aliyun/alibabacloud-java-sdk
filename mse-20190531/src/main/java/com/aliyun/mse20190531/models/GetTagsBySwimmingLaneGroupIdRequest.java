// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetTagsBySwimmingLaneGroupIdRequest extends TeaModel {
    // The language of the response. Valid values:
    // 
    // *   zh: Chinese
    // *   en: English
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // The ID of the lane group.
    @NameInMap("GroupId")
    public Long groupId;

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

}
