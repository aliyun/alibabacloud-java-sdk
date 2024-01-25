// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class UpdateIgnoreRiskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateIgnoreRiskResponseBody body;

    public static UpdateIgnoreRiskResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateIgnoreRiskResponse self = new UpdateIgnoreRiskResponse();
        return TeaModel.build(map, self);
    }

    public UpdateIgnoreRiskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateIgnoreRiskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateIgnoreRiskResponse setBody(UpdateIgnoreRiskResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateIgnoreRiskResponseBody getBody() {
        return this.body;
    }

}
