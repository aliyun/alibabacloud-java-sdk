// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class CheckGatewayConnectivityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckGatewayConnectivityResponseBody body;

    public static CheckGatewayConnectivityResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckGatewayConnectivityResponse self = new CheckGatewayConnectivityResponse();
        return TeaModel.build(map, self);
    }

    public CheckGatewayConnectivityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckGatewayConnectivityResponse setBody(CheckGatewayConnectivityResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckGatewayConnectivityResponseBody getBody() {
        return this.body;
    }

}
