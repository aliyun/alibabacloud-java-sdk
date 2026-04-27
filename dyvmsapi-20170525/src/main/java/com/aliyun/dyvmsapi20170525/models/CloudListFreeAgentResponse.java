// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudListFreeAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudListFreeAgentResponseBody body;

    public static CloudListFreeAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudListFreeAgentResponse self = new CloudListFreeAgentResponse();
        return TeaModel.build(map, self);
    }

    public CloudListFreeAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudListFreeAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudListFreeAgentResponse setBody(CloudListFreeAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudListFreeAgentResponseBody getBody() {
        return this.body;
    }

}
