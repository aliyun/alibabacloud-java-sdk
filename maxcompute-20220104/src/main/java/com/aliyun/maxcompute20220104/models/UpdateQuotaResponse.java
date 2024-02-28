// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class UpdateQuotaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateQuotaResponseBody body;

    public static UpdateQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateQuotaResponse self = new UpdateQuotaResponse();
        return TeaModel.build(map, self);
    }

    public UpdateQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateQuotaResponse setBody(UpdateQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateQuotaResponseBody getBody() {
        return this.body;
    }

}
