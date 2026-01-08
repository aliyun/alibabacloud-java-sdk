// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListFacebookPostsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFacebookPostsResponseBody body;

    public static ListFacebookPostsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFacebookPostsResponse self = new ListFacebookPostsResponse();
        return TeaModel.build(map, self);
    }

    public ListFacebookPostsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFacebookPostsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFacebookPostsResponse setBody(ListFacebookPostsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFacebookPostsResponseBody getBody() {
        return this.body;
    }

}
