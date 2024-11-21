// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListEnvironmentAddonsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEnvironmentAddonsResponseBody body;

    public static ListEnvironmentAddonsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentAddonsResponse self = new ListEnvironmentAddonsResponse();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentAddonsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEnvironmentAddonsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEnvironmentAddonsResponse setBody(ListEnvironmentAddonsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEnvironmentAddonsResponseBody getBody() {
        return this.body;
    }

}
