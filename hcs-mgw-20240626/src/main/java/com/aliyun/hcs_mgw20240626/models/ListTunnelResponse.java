// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class ListTunnelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTunnelResponseBody body;

    public static ListTunnelResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTunnelResponse self = new ListTunnelResponse();
        return TeaModel.build(map, self);
    }

    public ListTunnelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTunnelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTunnelResponse setBody(ListTunnelResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTunnelResponseBody getBody() {
        return this.body;
    }

}
