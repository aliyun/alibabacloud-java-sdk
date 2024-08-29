// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class GetApplicationVariables4FailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetApplicationVariables4FailResponseBody body;

    public static GetApplicationVariables4FailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationVariables4FailResponse self = new GetApplicationVariables4FailResponse();
        return TeaModel.build(map, self);
    }

    public GetApplicationVariables4FailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetApplicationVariables4FailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetApplicationVariables4FailResponse setBody(GetApplicationVariables4FailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetApplicationVariables4FailResponseBody getBody() {
        return this.body;
    }

}
