// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryGatewayRegionRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    public static QueryGatewayRegionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryGatewayRegionRequest self = new QueryGatewayRegionRequest();
        return TeaModel.build(map, self);
    }

    public QueryGatewayRegionRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

}
