// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudCreateAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudCreateAgentResponseBody body;

    public static CloudCreateAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudCreateAgentResponse self = new CloudCreateAgentResponse();
        return TeaModel.build(map, self);
    }

    public CloudCreateAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudCreateAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudCreateAgentResponse setBody(CloudCreateAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudCreateAgentResponseBody getBody() {
        return this.body;
    }

}
