// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class MoveTaskFlowToScenarioResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MoveTaskFlowToScenarioResponseBody body;

    public static MoveTaskFlowToScenarioResponse build(java.util.Map<String, ?> map) throws Exception {
        MoveTaskFlowToScenarioResponse self = new MoveTaskFlowToScenarioResponse();
        return TeaModel.build(map, self);
    }

    public MoveTaskFlowToScenarioResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MoveTaskFlowToScenarioResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MoveTaskFlowToScenarioResponse setBody(MoveTaskFlowToScenarioResponseBody body) {
        this.body = body;
        return this;
    }
    public MoveTaskFlowToScenarioResponseBody getBody() {
        return this.body;
    }

}
