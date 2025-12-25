// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteDigitalEmployeeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDigitalEmployeeResponseBody body;

    public static DeleteDigitalEmployeeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDigitalEmployeeResponse self = new DeleteDigitalEmployeeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDigitalEmployeeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDigitalEmployeeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDigitalEmployeeResponse setBody(DeleteDigitalEmployeeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDigitalEmployeeResponseBody getBody() {
        return this.body;
    }

}
