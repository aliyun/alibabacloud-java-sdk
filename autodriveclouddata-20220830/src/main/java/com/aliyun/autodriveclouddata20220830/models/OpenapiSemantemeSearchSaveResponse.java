// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.autodriveclouddata20220830.models;

import com.aliyun.tea.*;

public class OpenapiSemantemeSearchSaveResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public OpenapiSemantemeSearchSaveResponseBody body;

    public static OpenapiSemantemeSearchSaveResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenapiSemantemeSearchSaveResponse self = new OpenapiSemantemeSearchSaveResponse();
        return TeaModel.build(map, self);
    }

    public OpenapiSemantemeSearchSaveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenapiSemantemeSearchSaveResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenapiSemantemeSearchSaveResponse setBody(OpenapiSemantemeSearchSaveResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenapiSemantemeSearchSaveResponseBody getBody() {
        return this.body;
    }

}
