// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ActivateEdgeMobileAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ActivateEdgeMobileAgentResponseBody body;

    public static ActivateEdgeMobileAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        ActivateEdgeMobileAgentResponse self = new ActivateEdgeMobileAgentResponse();
        return TeaModel.build(map, self);
    }

    public ActivateEdgeMobileAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ActivateEdgeMobileAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ActivateEdgeMobileAgentResponse setBody(ActivateEdgeMobileAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public ActivateEdgeMobileAgentResponseBody getBody() {
        return this.body;
    }

}
