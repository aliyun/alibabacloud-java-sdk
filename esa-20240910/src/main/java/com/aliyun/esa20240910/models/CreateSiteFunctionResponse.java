// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateSiteFunctionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSiteFunctionResponseBody body;

    public static CreateSiteFunctionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSiteFunctionResponse self = new CreateSiteFunctionResponse();
        return TeaModel.build(map, self);
    }

    public CreateSiteFunctionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSiteFunctionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSiteFunctionResponse setBody(CreateSiteFunctionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSiteFunctionResponseBody getBody() {
        return this.body;
    }

}
