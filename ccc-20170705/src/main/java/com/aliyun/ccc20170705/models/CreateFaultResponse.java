// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class CreateFaultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateFaultResponseBody body;

    public static CreateFaultResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFaultResponse self = new CreateFaultResponse();
        return TeaModel.build(map, self);
    }

    public CreateFaultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFaultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFaultResponse setBody(CreateFaultResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFaultResponseBody getBody() {
        return this.body;
    }

}
