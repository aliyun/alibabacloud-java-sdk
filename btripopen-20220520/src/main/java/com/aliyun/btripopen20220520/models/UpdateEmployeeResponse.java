// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class UpdateEmployeeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateEmployeeResponseBody body;

    public static UpdateEmployeeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEmployeeResponse self = new UpdateEmployeeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEmployeeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEmployeeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEmployeeResponse setBody(UpdateEmployeeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEmployeeResponseBody getBody() {
        return this.body;
    }

}
