// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudGetQueueResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudGetQueueResponseBody body;

    public static CloudGetQueueResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudGetQueueResponse self = new CloudGetQueueResponse();
        return TeaModel.build(map, self);
    }

    public CloudGetQueueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudGetQueueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudGetQueueResponse setBody(CloudGetQueueResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudGetQueueResponseBody getBody() {
        return this.body;
    }

}
