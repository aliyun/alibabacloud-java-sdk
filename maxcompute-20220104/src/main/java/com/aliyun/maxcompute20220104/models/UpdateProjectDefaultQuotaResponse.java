// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class UpdateProjectDefaultQuotaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateProjectDefaultQuotaResponseBody body;

    public static UpdateProjectDefaultQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectDefaultQuotaResponse self = new UpdateProjectDefaultQuotaResponse();
        return TeaModel.build(map, self);
    }

    public UpdateProjectDefaultQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateProjectDefaultQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateProjectDefaultQuotaResponse setBody(UpdateProjectDefaultQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateProjectDefaultQuotaResponseBody getBody() {
        return this.body;
    }

}
