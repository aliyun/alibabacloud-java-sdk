// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateAIServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAIServiceResponseBody body;

    public static CreateAIServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAIServiceResponse self = new CreateAIServiceResponse();
        return TeaModel.build(map, self);
    }

    public CreateAIServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAIServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAIServiceResponse setBody(CreateAIServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAIServiceResponseBody getBody() {
        return this.body;
    }

}
