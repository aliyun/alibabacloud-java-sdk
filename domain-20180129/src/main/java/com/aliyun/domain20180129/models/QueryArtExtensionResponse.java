// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryArtExtensionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryArtExtensionResponseBody body;

    public static QueryArtExtensionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryArtExtensionResponse self = new QueryArtExtensionResponse();
        return TeaModel.build(map, self);
    }

    public QueryArtExtensionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryArtExtensionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryArtExtensionResponse setBody(QueryArtExtensionResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryArtExtensionResponseBody getBody() {
        return this.body;
    }

}
