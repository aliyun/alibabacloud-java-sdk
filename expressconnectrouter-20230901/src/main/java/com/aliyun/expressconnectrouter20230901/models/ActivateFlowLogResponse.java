// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class ActivateFlowLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ActivateFlowLogResponseBody body;

    public static ActivateFlowLogResponse build(java.util.Map<String, ?> map) throws Exception {
        ActivateFlowLogResponse self = new ActivateFlowLogResponse();
        return TeaModel.build(map, self);
    }

    public ActivateFlowLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ActivateFlowLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ActivateFlowLogResponse setBody(ActivateFlowLogResponseBody body) {
        this.body = body;
        return this;
    }
    public ActivateFlowLogResponseBody getBody() {
        return this.body;
    }

}
