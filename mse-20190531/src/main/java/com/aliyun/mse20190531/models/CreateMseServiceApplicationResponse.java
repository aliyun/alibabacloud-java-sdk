// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateMseServiceApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMseServiceApplicationResponseBody body;

    public static CreateMseServiceApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMseServiceApplicationResponse self = new CreateMseServiceApplicationResponse();
        return TeaModel.build(map, self);
    }

    public CreateMseServiceApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMseServiceApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMseServiceApplicationResponse setBody(CreateMseServiceApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMseServiceApplicationResponseBody getBody() {
        return this.body;
    }

}
