// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class UpdateTaskCustomerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateTaskCustomerResponseBody body;

    public static UpdateTaskCustomerResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskCustomerResponse self = new UpdateTaskCustomerResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTaskCustomerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTaskCustomerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTaskCustomerResponse setBody(UpdateTaskCustomerResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTaskCustomerResponseBody getBody() {
        return this.body;
    }

}
