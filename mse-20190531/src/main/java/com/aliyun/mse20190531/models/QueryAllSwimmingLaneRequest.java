// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryAllSwimmingLaneRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("MseSessionId")
    public String mseSessionId;

    public static QueryAllSwimmingLaneRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAllSwimmingLaneRequest self = new QueryAllSwimmingLaneRequest();
        return TeaModel.build(map, self);
    }

    public QueryAllSwimmingLaneRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public QueryAllSwimmingLaneRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public QueryAllSwimmingLaneRequest setMseSessionId(String mseSessionId) {
        this.mseSessionId = mseSessionId;
        return this;
    }
    public String getMseSessionId() {
        return this.mseSessionId;
    }

}
