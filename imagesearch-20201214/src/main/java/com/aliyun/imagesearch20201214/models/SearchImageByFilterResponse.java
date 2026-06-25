// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class SearchImageByFilterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchImageByFilterResponseBody body;

    public static SearchImageByFilterResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchImageByFilterResponse self = new SearchImageByFilterResponse();
        return TeaModel.build(map, self);
    }

    public SearchImageByFilterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchImageByFilterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchImageByFilterResponse setBody(SearchImageByFilterResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchImageByFilterResponseBody getBody() {
        return this.body;
    }

}
