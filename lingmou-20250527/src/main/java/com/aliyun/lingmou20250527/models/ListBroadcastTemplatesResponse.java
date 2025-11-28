// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class ListBroadcastTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListBroadcastTemplatesResponseBody body;

    public static ListBroadcastTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBroadcastTemplatesResponse self = new ListBroadcastTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListBroadcastTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBroadcastTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBroadcastTemplatesResponse setBody(ListBroadcastTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBroadcastTemplatesResponseBody getBody() {
        return this.body;
    }

}
