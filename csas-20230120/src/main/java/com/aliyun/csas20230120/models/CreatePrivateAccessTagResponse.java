// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreatePrivateAccessTagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePrivateAccessTagResponseBody body;

    public static CreatePrivateAccessTagResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePrivateAccessTagResponse self = new CreatePrivateAccessTagResponse();
        return TeaModel.build(map, self);
    }

    public CreatePrivateAccessTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePrivateAccessTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePrivateAccessTagResponse setBody(CreatePrivateAccessTagResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePrivateAccessTagResponseBody getBody() {
        return this.body;
    }

}
