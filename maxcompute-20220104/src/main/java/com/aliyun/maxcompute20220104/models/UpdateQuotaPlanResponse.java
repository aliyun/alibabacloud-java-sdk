// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class UpdateQuotaPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateQuotaPlanResponseBody body;

    public static UpdateQuotaPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateQuotaPlanResponse self = new UpdateQuotaPlanResponse();
        return TeaModel.build(map, self);
    }

    public UpdateQuotaPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateQuotaPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateQuotaPlanResponse setBody(UpdateQuotaPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateQuotaPlanResponseBody getBody() {
        return this.body;
    }

}
