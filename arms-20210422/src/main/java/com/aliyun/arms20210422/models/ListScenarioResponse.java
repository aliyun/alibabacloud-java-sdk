// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class ListScenarioResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListScenarioResponseBody body;

    public static ListScenarioResponse build(java.util.Map<String, ?> map) throws Exception {
        ListScenarioResponse self = new ListScenarioResponse();
        return TeaModel.build(map, self);
    }

    public ListScenarioResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListScenarioResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListScenarioResponse setBody(ListScenarioResponseBody body) {
        this.body = body;
        return this;
    }
    public ListScenarioResponseBody getBody() {
        return this.body;
    }

}
