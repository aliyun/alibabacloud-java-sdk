// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateCustomFieldResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCustomFieldResponseBody body;

    public static CreateCustomFieldResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomFieldResponse self = new CreateCustomFieldResponse();
        return TeaModel.build(map, self);
    }

    public CreateCustomFieldResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCustomFieldResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCustomFieldResponse setBody(CreateCustomFieldResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCustomFieldResponseBody getBody() {
        return this.body;
    }

}
