// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryInstanceGaapCostResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryInstanceGaapCostResponseBody body;

    public static QueryInstanceGaapCostResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInstanceGaapCostResponse self = new QueryInstanceGaapCostResponse();
        return TeaModel.build(map, self);
    }

    public QueryInstanceGaapCostResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryInstanceGaapCostResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryInstanceGaapCostResponse setBody(QueryInstanceGaapCostResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryInstanceGaapCostResponseBody getBody() {
        return this.body;
    }

}
