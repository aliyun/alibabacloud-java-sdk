// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DisconnectDesktopSessionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisconnectDesktopSessionsResponseBody body;

    public static DisconnectDesktopSessionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DisconnectDesktopSessionsResponse self = new DisconnectDesktopSessionsResponse();
        return TeaModel.build(map, self);
    }

    public DisconnectDesktopSessionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisconnectDesktopSessionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisconnectDesktopSessionsResponse setBody(DisconnectDesktopSessionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DisconnectDesktopSessionsResponseBody getBody() {
        return this.body;
    }

}
