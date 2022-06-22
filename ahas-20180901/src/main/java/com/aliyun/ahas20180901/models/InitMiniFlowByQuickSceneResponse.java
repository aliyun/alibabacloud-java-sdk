// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class InitMiniFlowByQuickSceneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public InitMiniFlowByQuickSceneResponseBody body;

    public static InitMiniFlowByQuickSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        InitMiniFlowByQuickSceneResponse self = new InitMiniFlowByQuickSceneResponse();
        return TeaModel.build(map, self);
    }

    public InitMiniFlowByQuickSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitMiniFlowByQuickSceneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InitMiniFlowByQuickSceneResponse setBody(InitMiniFlowByQuickSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public InitMiniFlowByQuickSceneResponseBody getBody() {
        return this.body;
    }

}
