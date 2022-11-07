// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class UpdateRegisteredLocationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateRegisteredLocationResponseBody body;

    public static UpdateRegisteredLocationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRegisteredLocationResponse self = new UpdateRegisteredLocationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRegisteredLocationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRegisteredLocationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRegisteredLocationResponse setBody(UpdateRegisteredLocationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRegisteredLocationResponseBody getBody() {
        return this.body;
    }

}
