// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SwitchFunctionAuthorizedStateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SwitchFunctionAuthorizedStateResponseBody body;

    public static SwitchFunctionAuthorizedStateResponse build(java.util.Map<String, ?> map) throws Exception {
        SwitchFunctionAuthorizedStateResponse self = new SwitchFunctionAuthorizedStateResponse();
        return TeaModel.build(map, self);
    }

    public SwitchFunctionAuthorizedStateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SwitchFunctionAuthorizedStateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SwitchFunctionAuthorizedStateResponse setBody(SwitchFunctionAuthorizedStateResponseBody body) {
        this.body = body;
        return this;
    }
    public SwitchFunctionAuthorizedStateResponseBody getBody() {
        return this.body;
    }

}
