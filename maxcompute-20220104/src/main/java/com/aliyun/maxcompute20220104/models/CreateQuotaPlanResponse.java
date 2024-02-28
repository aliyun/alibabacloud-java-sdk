// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class CreateQuotaPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateQuotaPlanResponseBody body;

    public static CreateQuotaPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateQuotaPlanResponse self = new CreateQuotaPlanResponse();
        return TeaModel.build(map, self);
    }

    public CreateQuotaPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateQuotaPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateQuotaPlanResponse setBody(CreateQuotaPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateQuotaPlanResponseBody getBody() {
        return this.body;
    }

}
