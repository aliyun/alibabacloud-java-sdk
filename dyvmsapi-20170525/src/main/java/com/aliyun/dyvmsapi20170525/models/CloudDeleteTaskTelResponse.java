// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudDeleteTaskTelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudDeleteTaskTelResponseBody body;

    public static CloudDeleteTaskTelResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudDeleteTaskTelResponse self = new CloudDeleteTaskTelResponse();
        return TeaModel.build(map, self);
    }

    public CloudDeleteTaskTelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudDeleteTaskTelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudDeleteTaskTelResponse setBody(CloudDeleteTaskTelResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudDeleteTaskTelResponseBody getBody() {
        return this.body;
    }

}
