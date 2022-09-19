// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateAdbMySqlDevParametersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAdbMySqlDevParametersResponseBody body;

    public static CreateAdbMySqlDevParametersResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAdbMySqlDevParametersResponse self = new CreateAdbMySqlDevParametersResponse();
        return TeaModel.build(map, self);
    }

    public CreateAdbMySqlDevParametersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAdbMySqlDevParametersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAdbMySqlDevParametersResponse setBody(CreateAdbMySqlDevParametersResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAdbMySqlDevParametersResponseBody getBody() {
        return this.body;
    }

}
