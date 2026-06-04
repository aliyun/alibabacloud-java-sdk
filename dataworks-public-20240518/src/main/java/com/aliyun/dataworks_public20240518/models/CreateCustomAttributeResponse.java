// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateCustomAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCustomAttributeResponseBody body;

    public static CreateCustomAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomAttributeResponse self = new CreateCustomAttributeResponse();
        return TeaModel.build(map, self);
    }

    public CreateCustomAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCustomAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCustomAttributeResponse setBody(CreateCustomAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCustomAttributeResponseBody getBody() {
        return this.body;
    }

}
