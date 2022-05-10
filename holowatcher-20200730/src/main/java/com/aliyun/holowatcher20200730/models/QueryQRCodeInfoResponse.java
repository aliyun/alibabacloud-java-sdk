// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class QueryQRCodeInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryQRCodeInfoResponseBody body;

    public static QueryQRCodeInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryQRCodeInfoResponse self = new QueryQRCodeInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryQRCodeInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryQRCodeInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryQRCodeInfoResponse setBody(QueryQRCodeInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryQRCodeInfoResponseBody getBody() {
        return this.body;
    }

}
