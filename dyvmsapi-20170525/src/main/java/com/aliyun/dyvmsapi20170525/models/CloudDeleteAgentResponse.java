// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudDeleteAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudDeleteAgentResponseBody body;

    public static CloudDeleteAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudDeleteAgentResponse self = new CloudDeleteAgentResponse();
        return TeaModel.build(map, self);
    }

    public CloudDeleteAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudDeleteAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudDeleteAgentResponse setBody(CloudDeleteAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudDeleteAgentResponseBody getBody() {
        return this.body;
    }

}
