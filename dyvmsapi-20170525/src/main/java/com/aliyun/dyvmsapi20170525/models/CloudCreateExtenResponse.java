// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudCreateExtenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudCreateExtenResponseBody body;

    public static CloudCreateExtenResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudCreateExtenResponse self = new CloudCreateExtenResponse();
        return TeaModel.build(map, self);
    }

    public CloudCreateExtenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudCreateExtenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudCreateExtenResponse setBody(CloudCreateExtenResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudCreateExtenResponseBody getBody() {
        return this.body;
    }

}
