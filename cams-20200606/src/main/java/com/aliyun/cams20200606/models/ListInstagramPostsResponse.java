// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListInstagramPostsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInstagramPostsResponseBody body;

    public static ListInstagramPostsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstagramPostsResponse self = new ListInstagramPostsResponse();
        return TeaModel.build(map, self);
    }

    public ListInstagramPostsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstagramPostsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstagramPostsResponse setBody(ListInstagramPostsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstagramPostsResponseBody getBody() {
        return this.body;
    }

}
