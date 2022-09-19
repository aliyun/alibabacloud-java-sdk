// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DeleteAdbMySqlDevParametersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAdbMySqlDevParametersResponseBody body;

    public static DeleteAdbMySqlDevParametersResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAdbMySqlDevParametersResponse self = new DeleteAdbMySqlDevParametersResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAdbMySqlDevParametersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAdbMySqlDevParametersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAdbMySqlDevParametersResponse setBody(DeleteAdbMySqlDevParametersResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAdbMySqlDevParametersResponseBody getBody() {
        return this.body;
    }

}
