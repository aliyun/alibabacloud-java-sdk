// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateDigitalEmployeeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDigitalEmployeeResponseBody body;

    public static UpdateDigitalEmployeeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDigitalEmployeeResponse self = new UpdateDigitalEmployeeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDigitalEmployeeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDigitalEmployeeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDigitalEmployeeResponse setBody(UpdateDigitalEmployeeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDigitalEmployeeResponseBody getBody() {
        return this.body;
    }

}
