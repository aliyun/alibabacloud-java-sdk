// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DeleteScenarioResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteScenarioResponseBody body;

    public static DeleteScenarioResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteScenarioResponse self = new DeleteScenarioResponse();
        return TeaModel.build(map, self);
    }

    public DeleteScenarioResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteScenarioResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteScenarioResponse setBody(DeleteScenarioResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteScenarioResponseBody getBody() {
        return this.body;
    }

}
