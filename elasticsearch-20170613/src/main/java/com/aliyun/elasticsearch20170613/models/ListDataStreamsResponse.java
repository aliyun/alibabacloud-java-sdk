// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListDataStreamsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataStreamsResponseBody body;

    public static ListDataStreamsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataStreamsResponse self = new ListDataStreamsResponse();
        return TeaModel.build(map, self);
    }

    public ListDataStreamsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataStreamsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataStreamsResponse setBody(ListDataStreamsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataStreamsResponseBody getBody() {
        return this.body;
    }

}
