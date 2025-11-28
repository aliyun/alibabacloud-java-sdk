// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class ListBroadcastVideosByIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListBroadcastVideosByIdResponseBody body;

    public static ListBroadcastVideosByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBroadcastVideosByIdResponse self = new ListBroadcastVideosByIdResponse();
        return TeaModel.build(map, self);
    }

    public ListBroadcastVideosByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBroadcastVideosByIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBroadcastVideosByIdResponse setBody(ListBroadcastVideosByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBroadcastVideosByIdResponseBody getBody() {
        return this.body;
    }

}
