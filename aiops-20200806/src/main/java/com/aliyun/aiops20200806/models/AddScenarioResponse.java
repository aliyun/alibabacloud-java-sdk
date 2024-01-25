// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class AddScenarioResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddScenarioResponseBody body;

    public static AddScenarioResponse build(java.util.Map<String, ?> map) throws Exception {
        AddScenarioResponse self = new AddScenarioResponse();
        return TeaModel.build(map, self);
    }

    public AddScenarioResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddScenarioResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddScenarioResponse setBody(AddScenarioResponseBody body) {
        this.body = body;
        return this;
    }
    public AddScenarioResponseBody getBody() {
        return this.body;
    }

}
