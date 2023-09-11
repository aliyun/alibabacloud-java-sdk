// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ConnectKmsInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ConnectKmsInstanceResponseBody body;

    public static ConnectKmsInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ConnectKmsInstanceResponse self = new ConnectKmsInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ConnectKmsInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConnectKmsInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConnectKmsInstanceResponse setBody(ConnectKmsInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ConnectKmsInstanceResponseBody getBody() {
        return this.body;
    }

}
