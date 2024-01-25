// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class UpdateHandleRiskBaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateHandleRiskBaseResponseBody body;

    public static UpdateHandleRiskBaseResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHandleRiskBaseResponse self = new UpdateHandleRiskBaseResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHandleRiskBaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHandleRiskBaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateHandleRiskBaseResponse setBody(UpdateHandleRiskBaseResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHandleRiskBaseResponseBody getBody() {
        return this.body;
    }

}
