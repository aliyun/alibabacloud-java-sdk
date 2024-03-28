// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class QuerySpaceConsumptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySpaceConsumptionResponseBody body;

    public static QuerySpaceConsumptionResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySpaceConsumptionResponse self = new QuerySpaceConsumptionResponse();
        return TeaModel.build(map, self);
    }

    public QuerySpaceConsumptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySpaceConsumptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySpaceConsumptionResponse setBody(QuerySpaceConsumptionResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySpaceConsumptionResponseBody getBody() {
        return this.body;
    }

}
