// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudDeleteAgentTelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudDeleteAgentTelResponseBody body;

    public static CloudDeleteAgentTelResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudDeleteAgentTelResponse self = new CloudDeleteAgentTelResponse();
        return TeaModel.build(map, self);
    }

    public CloudDeleteAgentTelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudDeleteAgentTelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudDeleteAgentTelResponse setBody(CloudDeleteAgentTelResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudDeleteAgentTelResponseBody getBody() {
        return this.body;
    }

}
