// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudCreateQueueResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudCreateQueueResponseBody body;

    public static CloudCreateQueueResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudCreateQueueResponse self = new CloudCreateQueueResponse();
        return TeaModel.build(map, self);
    }

    public CloudCreateQueueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudCreateQueueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudCreateQueueResponse setBody(CloudCreateQueueResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudCreateQueueResponseBody getBody() {
        return this.body;
    }

}
