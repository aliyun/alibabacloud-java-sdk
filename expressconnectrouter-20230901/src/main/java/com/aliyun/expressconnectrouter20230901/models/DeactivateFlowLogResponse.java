// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class DeactivateFlowLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeactivateFlowLogResponseBody body;

    public static DeactivateFlowLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DeactivateFlowLogResponse self = new DeactivateFlowLogResponse();
        return TeaModel.build(map, self);
    }

    public DeactivateFlowLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeactivateFlowLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeactivateFlowLogResponse setBody(DeactivateFlowLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DeactivateFlowLogResponseBody getBody() {
        return this.body;
    }

}
