// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListListenersByIpResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListListenersByIpResponseBody body;

    public static ListListenersByIpResponse build(java.util.Map<String, ?> map) throws Exception {
        ListListenersByIpResponse self = new ListListenersByIpResponse();
        return TeaModel.build(map, self);
    }

    public ListListenersByIpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListListenersByIpResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListListenersByIpResponse setBody(ListListenersByIpResponseBody body) {
        this.body = body;
        return this;
    }
    public ListListenersByIpResponseBody getBody() {
        return this.body;
    }

}
