// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryThermodynamicDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryThermodynamicDataResponseBody body;

    public static QueryThermodynamicDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryThermodynamicDataResponse self = new QueryThermodynamicDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryThermodynamicDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryThermodynamicDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryThermodynamicDataResponse setBody(QueryThermodynamicDataResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryThermodynamicDataResponseBody getBody() {
        return this.body;
    }

}
