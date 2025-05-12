// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListWritingStylesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWritingStylesResponseBody body;

    public static ListWritingStylesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWritingStylesResponse self = new ListWritingStylesResponse();
        return TeaModel.build(map, self);
    }

    public ListWritingStylesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWritingStylesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWritingStylesResponse setBody(ListWritingStylesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWritingStylesResponseBody getBody() {
        return this.body;
    }

}
