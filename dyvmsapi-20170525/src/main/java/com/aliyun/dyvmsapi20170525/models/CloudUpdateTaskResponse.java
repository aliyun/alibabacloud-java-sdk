// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudUpdateTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudUpdateTaskResponseBody body;

    public static CloudUpdateTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudUpdateTaskResponse self = new CloudUpdateTaskResponse();
        return TeaModel.build(map, self);
    }

    public CloudUpdateTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudUpdateTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudUpdateTaskResponse setBody(CloudUpdateTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudUpdateTaskResponseBody getBody() {
        return this.body;
    }

}
