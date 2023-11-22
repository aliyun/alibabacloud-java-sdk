// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SearchMediaByMultimodalResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SearchMediaByMultimodalResponseBody body;

    public static SearchMediaByMultimodalResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchMediaByMultimodalResponse self = new SearchMediaByMultimodalResponse();
        return TeaModel.build(map, self);
    }

    public SearchMediaByMultimodalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchMediaByMultimodalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchMediaByMultimodalResponse setBody(SearchMediaByMultimodalResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchMediaByMultimodalResponseBody getBody() {
        return this.body;
    }

}
