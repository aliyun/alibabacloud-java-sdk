// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateProtocolServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateProtocolServiceResponseBody body;

    public static CreateProtocolServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateProtocolServiceResponse self = new CreateProtocolServiceResponse();
        return TeaModel.build(map, self);
    }

    public CreateProtocolServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateProtocolServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateProtocolServiceResponse setBody(CreateProtocolServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateProtocolServiceResponseBody getBody() {
        return this.body;
    }

}
