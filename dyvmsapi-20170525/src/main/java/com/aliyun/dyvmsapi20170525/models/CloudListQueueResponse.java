// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudListQueueResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudListQueueResponseBody body;

    public static CloudListQueueResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudListQueueResponse self = new CloudListQueueResponse();
        return TeaModel.build(map, self);
    }

    public CloudListQueueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudListQueueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudListQueueResponse setBody(CloudListQueueResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudListQueueResponseBody getBody() {
        return this.body;
    }

}
