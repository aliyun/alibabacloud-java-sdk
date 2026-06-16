// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class SearchContextResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchContextResponseBody body;

    public static SearchContextResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchContextResponse self = new SearchContextResponse();
        return TeaModel.build(map, self);
    }

    public SearchContextResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchContextResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchContextResponse setBody(SearchContextResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchContextResponseBody getBody() {
        return this.body;
    }

}
