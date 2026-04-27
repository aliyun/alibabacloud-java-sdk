// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudUpdateAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudUpdateAgentResponseBody body;

    public static CloudUpdateAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudUpdateAgentResponse self = new CloudUpdateAgentResponse();
        return TeaModel.build(map, self);
    }

    public CloudUpdateAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudUpdateAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudUpdateAgentResponse setBody(CloudUpdateAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudUpdateAgentResponseBody getBody() {
        return this.body;
    }

}
