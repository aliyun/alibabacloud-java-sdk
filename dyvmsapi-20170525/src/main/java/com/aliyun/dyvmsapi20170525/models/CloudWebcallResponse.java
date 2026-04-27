// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudWebcallResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudWebcallResponseBody body;

    public static CloudWebcallResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudWebcallResponse self = new CloudWebcallResponse();
        return TeaModel.build(map, self);
    }

    public CloudWebcallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudWebcallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudWebcallResponse setBody(CloudWebcallResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudWebcallResponseBody getBody() {
        return this.body;
    }

}
