// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class CreateMajorCustomerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMajorCustomerResponseBody body;

    public static CreateMajorCustomerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMajorCustomerResponse self = new CreateMajorCustomerResponse();
        return TeaModel.build(map, self);
    }

    public CreateMajorCustomerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMajorCustomerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMajorCustomerResponse setBody(CreateMajorCustomerResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMajorCustomerResponseBody getBody() {
        return this.body;
    }

}
