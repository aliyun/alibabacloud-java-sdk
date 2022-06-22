// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class InitMiniFlowByAppCodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public InitMiniFlowByAppCodeResponseBody body;

    public static InitMiniFlowByAppCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        InitMiniFlowByAppCodeResponse self = new InitMiniFlowByAppCodeResponse();
        return TeaModel.build(map, self);
    }

    public InitMiniFlowByAppCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitMiniFlowByAppCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InitMiniFlowByAppCodeResponse setBody(InitMiniFlowByAppCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public InitMiniFlowByAppCodeResponseBody getBody() {
        return this.body;
    }

}
