// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class MultiModalAgentSSEResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MultiModalAgentSSEResponseBody body;

    public static MultiModalAgentSSEResponse build(java.util.Map<String, ?> map) throws Exception {
        MultiModalAgentSSEResponse self = new MultiModalAgentSSEResponse();
        return TeaModel.build(map, self);
    }

    public MultiModalAgentSSEResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MultiModalAgentSSEResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MultiModalAgentSSEResponse setBody(MultiModalAgentSSEResponseBody body) {
        this.body = body;
        return this;
    }
    public MultiModalAgentSSEResponseBody getBody() {
        return this.body;
    }

}
