// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class AddEmployeeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddEmployeeResponseBody body;

    public static AddEmployeeResponse build(java.util.Map<String, ?> map) throws Exception {
        AddEmployeeResponse self = new AddEmployeeResponse();
        return TeaModel.build(map, self);
    }

    public AddEmployeeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddEmployeeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddEmployeeResponse setBody(AddEmployeeResponseBody body) {
        this.body = body;
        return this;
    }
    public AddEmployeeResponseBody getBody() {
        return this.body;
    }

}
