// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudGetAgentStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudGetAgentStatusResponseBody body;

    public static CloudGetAgentStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudGetAgentStatusResponse self = new CloudGetAgentStatusResponse();
        return TeaModel.build(map, self);
    }

    public CloudGetAgentStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudGetAgentStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudGetAgentStatusResponse setBody(CloudGetAgentStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudGetAgentStatusResponseBody getBody() {
        return this.body;
    }

}
