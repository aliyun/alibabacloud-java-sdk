// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudListAgentTelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudListAgentTelResponseBody body;

    public static CloudListAgentTelResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudListAgentTelResponse self = new CloudListAgentTelResponse();
        return TeaModel.build(map, self);
    }

    public CloudListAgentTelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudListAgentTelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudListAgentTelResponse setBody(CloudListAgentTelResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudListAgentTelResponseBody getBody() {
        return this.body;
    }

}
