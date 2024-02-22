// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class SearchDocResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchDocResponseBody body;

    public static SearchDocResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchDocResponse self = new SearchDocResponse();
        return TeaModel.build(map, self);
    }

    public SearchDocResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchDocResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchDocResponse setBody(SearchDocResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchDocResponseBody getBody() {
        return this.body;
    }

}
