// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CancelAgentSessionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelAgentSessionResponseBody body;

    public static CancelAgentSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelAgentSessionResponse self = new CancelAgentSessionResponse();
        return TeaModel.build(map, self);
    }

    public CancelAgentSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelAgentSessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelAgentSessionResponse setBody(CancelAgentSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelAgentSessionResponseBody getBody() {
        return this.body;
    }

}
