// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20260423.models;

import com.aliyun.tea.*;

public class QuerySuccessIcpDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySuccessIcpDataResponseBody body;

    public static QuerySuccessIcpDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySuccessIcpDataResponse self = new QuerySuccessIcpDataResponse();
        return TeaModel.build(map, self);
    }

    public QuerySuccessIcpDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySuccessIcpDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySuccessIcpDataResponse setBody(QuerySuccessIcpDataResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySuccessIcpDataResponseBody getBody() {
        return this.body;
    }

}
