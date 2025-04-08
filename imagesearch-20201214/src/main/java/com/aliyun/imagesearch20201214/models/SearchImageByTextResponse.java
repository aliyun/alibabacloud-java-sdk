// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class SearchImageByTextResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchImageByTextResponseBody body;

    public static SearchImageByTextResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchImageByTextResponse self = new SearchImageByTextResponse();
        return TeaModel.build(map, self);
    }

    public SearchImageByTextResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchImageByTextResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchImageByTextResponse setBody(SearchImageByTextResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchImageByTextResponseBody getBody() {
        return this.body;
    }

}
