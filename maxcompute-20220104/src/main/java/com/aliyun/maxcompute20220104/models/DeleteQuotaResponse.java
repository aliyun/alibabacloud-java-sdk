// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class DeleteQuotaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteQuotaResponseBody body;

    public static DeleteQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteQuotaResponse self = new DeleteQuotaResponse();
        return TeaModel.build(map, self);
    }

    public DeleteQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteQuotaResponse setBody(DeleteQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteQuotaResponseBody getBody() {
        return this.body;
    }

}
