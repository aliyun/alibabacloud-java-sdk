// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateScenarioResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateScenarioResponseBody body;

    public static CreateScenarioResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateScenarioResponse self = new CreateScenarioResponse();
        return TeaModel.build(map, self);
    }

    public CreateScenarioResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateScenarioResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateScenarioResponse setBody(CreateScenarioResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateScenarioResponseBody getBody() {
        return this.body;
    }

}
