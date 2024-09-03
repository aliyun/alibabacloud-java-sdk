// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class GetApplicationVariablesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetApplicationVariablesResponseBody body;

    public static GetApplicationVariablesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationVariablesResponse self = new GetApplicationVariablesResponse();
        return TeaModel.build(map, self);
    }

    public GetApplicationVariablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetApplicationVariablesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetApplicationVariablesResponse setBody(GetApplicationVariablesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetApplicationVariablesResponseBody getBody() {
        return this.body;
    }

}
