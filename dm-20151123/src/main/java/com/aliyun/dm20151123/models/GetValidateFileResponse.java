// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class GetValidateFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetValidateFileResponseBody body;

    public static GetValidateFileResponse build(java.util.Map<String, ?> map) throws Exception {
        GetValidateFileResponse self = new GetValidateFileResponse();
        return TeaModel.build(map, self);
    }

    public GetValidateFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetValidateFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetValidateFileResponse setBody(GetValidateFileResponseBody body) {
        this.body = body;
        return this;
    }
    public GetValidateFileResponseBody getBody() {
        return this.body;
    }

}
