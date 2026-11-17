// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListImageTagsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListImageTagsResponseBody body;

    public static ListImageTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListImageTagsResponse self = new ListImageTagsResponse();
        return TeaModel.build(map, self);
    }

    public ListImageTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListImageTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListImageTagsResponse setBody(ListImageTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListImageTagsResponseBody getBody() {
        return this.body;
    }

}
