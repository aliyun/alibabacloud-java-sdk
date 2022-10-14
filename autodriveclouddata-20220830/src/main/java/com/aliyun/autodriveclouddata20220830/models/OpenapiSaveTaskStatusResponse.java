// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.autodriveclouddata20220830.models;

import com.aliyun.tea.*;

public class OpenapiSaveTaskStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public OpenapiSaveTaskStatusResponseBody body;

    public static OpenapiSaveTaskStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenapiSaveTaskStatusResponse self = new OpenapiSaveTaskStatusResponse();
        return TeaModel.build(map, self);
    }

    public OpenapiSaveTaskStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenapiSaveTaskStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenapiSaveTaskStatusResponse setBody(OpenapiSaveTaskStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenapiSaveTaskStatusResponseBody getBody() {
        return this.body;
    }

}
