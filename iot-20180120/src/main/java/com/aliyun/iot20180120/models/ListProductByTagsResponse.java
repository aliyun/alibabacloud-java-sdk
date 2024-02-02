// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListProductByTagsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListProductByTagsResponseBody body;

    public static ListProductByTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProductByTagsResponse self = new ListProductByTagsResponse();
        return TeaModel.build(map, self);
    }

    public ListProductByTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProductByTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProductByTagsResponse setBody(ListProductByTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProductByTagsResponseBody getBody() {
        return this.body;
    }

}
