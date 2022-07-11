// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class GetVariableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetVariableResponseBody body;

    public static GetVariableResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVariableResponse self = new GetVariableResponse();
        return TeaModel.build(map, self);
    }

    public GetVariableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVariableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVariableResponse setBody(GetVariableResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVariableResponseBody getBody() {
        return this.body;
    }

}
