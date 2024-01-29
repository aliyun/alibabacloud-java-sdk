// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SearchMediaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchMediaResponseBody body;

    public static SearchMediaResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchMediaResponse self = new SearchMediaResponse();
        return TeaModel.build(map, self);
    }

    public SearchMediaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchMediaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchMediaResponse setBody(SearchMediaResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchMediaResponseBody getBody() {
        return this.body;
    }

}
