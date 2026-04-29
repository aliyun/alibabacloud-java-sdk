// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudDeleteTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudDeleteTaskResponseBody body;

    public static CloudDeleteTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudDeleteTaskResponse self = new CloudDeleteTaskResponse();
        return TeaModel.build(map, self);
    }

    public CloudDeleteTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudDeleteTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudDeleteTaskResponse setBody(CloudDeleteTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudDeleteTaskResponseBody getBody() {
        return this.body;
    }

}
