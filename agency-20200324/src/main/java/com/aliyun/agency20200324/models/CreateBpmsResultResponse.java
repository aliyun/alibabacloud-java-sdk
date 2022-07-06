// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20200324.models;

import com.aliyun.tea.*;

public class CreateBpmsResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateBpmsResultResponseBody body;

    public static CreateBpmsResultResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBpmsResultResponse self = new CreateBpmsResultResponse();
        return TeaModel.build(map, self);
    }

    public CreateBpmsResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBpmsResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBpmsResultResponse setBody(CreateBpmsResultResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBpmsResultResponseBody getBody() {
        return this.body;
    }

}
