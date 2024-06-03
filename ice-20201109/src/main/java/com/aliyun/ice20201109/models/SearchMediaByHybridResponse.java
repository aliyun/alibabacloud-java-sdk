// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SearchMediaByHybridResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchMediaByHybridResponseBody body;

    public static SearchMediaByHybridResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchMediaByHybridResponse self = new SearchMediaByHybridResponse();
        return TeaModel.build(map, self);
    }

    public SearchMediaByHybridResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchMediaByHybridResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchMediaByHybridResponse setBody(SearchMediaByHybridResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchMediaByHybridResponseBody getBody() {
        return this.body;
    }

}
