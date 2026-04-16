// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudCreateTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudCreateTaskResponseBody body;

    public static CloudCreateTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudCreateTaskResponse self = new CloudCreateTaskResponse();
        return TeaModel.build(map, self);
    }

    public CloudCreateTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudCreateTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudCreateTaskResponse setBody(CloudCreateTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudCreateTaskResponseBody getBody() {
        return this.body;
    }

}
