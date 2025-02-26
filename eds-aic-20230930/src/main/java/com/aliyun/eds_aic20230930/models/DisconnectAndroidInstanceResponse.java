// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DisconnectAndroidInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisconnectAndroidInstanceResponseBody body;

    public static DisconnectAndroidInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DisconnectAndroidInstanceResponse self = new DisconnectAndroidInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DisconnectAndroidInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisconnectAndroidInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisconnectAndroidInstanceResponse setBody(DisconnectAndroidInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DisconnectAndroidInstanceResponseBody getBody() {
        return this.body;
    }

}
