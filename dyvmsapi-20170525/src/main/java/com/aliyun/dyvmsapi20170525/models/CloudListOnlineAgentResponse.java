// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudListOnlineAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudListOnlineAgentResponseBody body;

    public static CloudListOnlineAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudListOnlineAgentResponse self = new CloudListOnlineAgentResponse();
        return TeaModel.build(map, self);
    }

    public CloudListOnlineAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudListOnlineAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudListOnlineAgentResponse setBody(CloudListOnlineAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudListOnlineAgentResponseBody getBody() {
        return this.body;
    }

}
