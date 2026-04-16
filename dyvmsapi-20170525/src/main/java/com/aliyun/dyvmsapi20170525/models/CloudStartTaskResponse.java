// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudStartTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudStartTaskResponseBody body;

    public static CloudStartTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudStartTaskResponse self = new CloudStartTaskResponse();
        return TeaModel.build(map, self);
    }

    public CloudStartTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudStartTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudStartTaskResponse setBody(CloudStartTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudStartTaskResponseBody getBody() {
        return this.body;
    }

}
