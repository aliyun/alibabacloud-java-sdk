// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertalgorithm20230615.models;

import com.aliyun.tea.*;

public class QueryEnergyStorageStrategyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryEnergyStorageStrategyResponseBody body;

    public static QueryEnergyStorageStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEnergyStorageStrategyResponse self = new QueryEnergyStorageStrategyResponse();
        return TeaModel.build(map, self);
    }

    public QueryEnergyStorageStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryEnergyStorageStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryEnergyStorageStrategyResponse setBody(QueryEnergyStorageStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryEnergyStorageStrategyResponseBody getBody() {
        return this.body;
    }

}
