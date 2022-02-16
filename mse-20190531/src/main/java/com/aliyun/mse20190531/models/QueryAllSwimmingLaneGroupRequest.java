// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryAllSwimmingLaneGroupRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    public static QueryAllSwimmingLaneGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAllSwimmingLaneGroupRequest self = new QueryAllSwimmingLaneGroupRequest();
        return TeaModel.build(map, self);
    }

    public QueryAllSwimmingLaneGroupRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

}
