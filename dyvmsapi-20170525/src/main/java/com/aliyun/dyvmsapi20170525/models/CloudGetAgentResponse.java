// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudGetAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudGetAgentResponseBody body;

    public static CloudGetAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudGetAgentResponse self = new CloudGetAgentResponse();
        return TeaModel.build(map, self);
    }

    public CloudGetAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudGetAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudGetAgentResponse setBody(CloudGetAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudGetAgentResponseBody getBody() {
        return this.body;
    }

}
