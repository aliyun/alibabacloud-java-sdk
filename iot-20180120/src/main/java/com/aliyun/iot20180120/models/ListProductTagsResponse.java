// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListProductTagsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListProductTagsResponseBody body;

    public static ListProductTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProductTagsResponse self = new ListProductTagsResponse();
        return TeaModel.build(map, self);
    }

    public ListProductTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProductTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProductTagsResponse setBody(ListProductTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProductTagsResponseBody getBody() {
        return this.body;
    }

}
