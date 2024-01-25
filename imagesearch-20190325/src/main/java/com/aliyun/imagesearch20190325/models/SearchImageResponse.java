// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20190325.models;

import com.aliyun.tea.*;

public class SearchImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchImageResponseBody body;

    public static SearchImageResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchImageResponse self = new SearchImageResponse();
        return TeaModel.build(map, self);
    }

    public SearchImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchImageResponse setBody(SearchImageResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchImageResponseBody getBody() {
        return this.body;
    }

}
