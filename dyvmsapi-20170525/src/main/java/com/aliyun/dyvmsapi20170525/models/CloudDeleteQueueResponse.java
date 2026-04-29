// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudDeleteQueueResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudDeleteQueueResponseBody body;

    public static CloudDeleteQueueResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudDeleteQueueResponse self = new CloudDeleteQueueResponse();
        return TeaModel.build(map, self);
    }

    public CloudDeleteQueueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudDeleteQueueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudDeleteQueueResponse setBody(CloudDeleteQueueResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudDeleteQueueResponseBody getBody() {
        return this.body;
    }

}
