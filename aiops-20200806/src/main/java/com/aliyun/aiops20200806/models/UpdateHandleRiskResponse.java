// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class UpdateHandleRiskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateHandleRiskResponseBody body;

    public static UpdateHandleRiskResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHandleRiskResponse self = new UpdateHandleRiskResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHandleRiskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHandleRiskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateHandleRiskResponse setBody(UpdateHandleRiskResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHandleRiskResponseBody getBody() {
        return this.body;
    }

}
