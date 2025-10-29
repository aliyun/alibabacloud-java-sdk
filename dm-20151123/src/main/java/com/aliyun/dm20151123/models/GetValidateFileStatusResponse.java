// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class GetValidateFileStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetValidateFileStatusResponseBody body;

    public static GetValidateFileStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetValidateFileStatusResponse self = new GetValidateFileStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetValidateFileStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetValidateFileStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetValidateFileStatusResponse setBody(GetValidateFileStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetValidateFileStatusResponseBody getBody() {
        return this.body;
    }

}
