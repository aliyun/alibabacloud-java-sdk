// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210722.models;

import com.aliyun.tea.*;

public class CreateResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateResourceResponseBody body;

    public static CreateResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceResponse self = new CreateResourceResponse();
        return TeaModel.build(map, self);
    }

    public CreateResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateResourceResponse setBody(CreateResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateResourceResponseBody getBody() {
        return this.body;
    }

}
