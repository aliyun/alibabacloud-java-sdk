// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class CreateLogicalDeleteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLogicalDeleteResponseBody body;

    public static CreateLogicalDeleteResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLogicalDeleteResponse self = new CreateLogicalDeleteResponse();
        return TeaModel.build(map, self);
    }

    public CreateLogicalDeleteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLogicalDeleteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLogicalDeleteResponse setBody(CreateLogicalDeleteResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLogicalDeleteResponseBody getBody() {
        return this.body;
    }

}
