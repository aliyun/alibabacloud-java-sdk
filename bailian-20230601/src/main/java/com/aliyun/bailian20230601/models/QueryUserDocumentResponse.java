// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class QueryUserDocumentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryUserDocumentResponseBody body;

    public static QueryUserDocumentResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUserDocumentResponse self = new QueryUserDocumentResponse();
        return TeaModel.build(map, self);
    }

    public QueryUserDocumentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryUserDocumentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryUserDocumentResponse setBody(QueryUserDocumentResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryUserDocumentResponseBody getBody() {
        return this.body;
    }

}
