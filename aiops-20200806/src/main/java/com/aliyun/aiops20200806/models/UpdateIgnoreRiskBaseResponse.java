// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class UpdateIgnoreRiskBaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateIgnoreRiskBaseResponseBody body;

    public static UpdateIgnoreRiskBaseResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateIgnoreRiskBaseResponse self = new UpdateIgnoreRiskBaseResponse();
        return TeaModel.build(map, self);
    }

    public UpdateIgnoreRiskBaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateIgnoreRiskBaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateIgnoreRiskBaseResponse setBody(UpdateIgnoreRiskBaseResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateIgnoreRiskBaseResponseBody getBody() {
        return this.body;
    }

}
