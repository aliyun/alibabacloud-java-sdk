// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class ListQueueResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListQueueResponseBody body;

    public static ListQueueResponse build(java.util.Map<String, ?> map) throws Exception {
        ListQueueResponse self = new ListQueueResponse();
        return TeaModel.build(map, self);
    }

    public ListQueueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListQueueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListQueueResponse setBody(ListQueueResponseBody body) {
        this.body = body;
        return this;
    }
    public ListQueueResponseBody getBody() {
        return this.body;
    }

}
