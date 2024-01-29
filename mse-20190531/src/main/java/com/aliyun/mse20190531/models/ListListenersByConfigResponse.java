// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListListenersByConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListListenersByConfigResponseBody body;

    public static ListListenersByConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ListListenersByConfigResponse self = new ListListenersByConfigResponse();
        return TeaModel.build(map, self);
    }

    public ListListenersByConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListListenersByConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListListenersByConfigResponse setBody(ListListenersByConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ListListenersByConfigResponseBody getBody() {
        return this.body;
    }

}
