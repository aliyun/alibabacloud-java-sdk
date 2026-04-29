// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudDeleteExtenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudDeleteExtenResponseBody body;

    public static CloudDeleteExtenResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudDeleteExtenResponse self = new CloudDeleteExtenResponse();
        return TeaModel.build(map, self);
    }

    public CloudDeleteExtenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudDeleteExtenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudDeleteExtenResponse setBody(CloudDeleteExtenResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudDeleteExtenResponseBody getBody() {
        return this.body;
    }

}
