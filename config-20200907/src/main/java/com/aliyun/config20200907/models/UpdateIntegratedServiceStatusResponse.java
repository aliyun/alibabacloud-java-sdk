// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateIntegratedServiceStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateIntegratedServiceStatusResponseBody body;

    public static UpdateIntegratedServiceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateIntegratedServiceStatusResponse self = new UpdateIntegratedServiceStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateIntegratedServiceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateIntegratedServiceStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateIntegratedServiceStatusResponse setBody(UpdateIntegratedServiceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateIntegratedServiceStatusResponseBody getBody() {
        return this.body;
    }

}
