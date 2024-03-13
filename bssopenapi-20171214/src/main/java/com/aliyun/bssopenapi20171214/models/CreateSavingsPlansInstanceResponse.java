// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class CreateSavingsPlansInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSavingsPlansInstanceResponseBody body;

    public static CreateSavingsPlansInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSavingsPlansInstanceResponse self = new CreateSavingsPlansInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateSavingsPlansInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSavingsPlansInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSavingsPlansInstanceResponse setBody(CreateSavingsPlansInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSavingsPlansInstanceResponseBody getBody() {
        return this.body;
    }

}
