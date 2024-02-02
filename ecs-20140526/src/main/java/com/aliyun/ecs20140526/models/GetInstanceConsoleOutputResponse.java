// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class GetInstanceConsoleOutputResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstanceConsoleOutputResponseBody body;

    public static GetInstanceConsoleOutputResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceConsoleOutputResponse self = new GetInstanceConsoleOutputResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceConsoleOutputResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceConsoleOutputResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceConsoleOutputResponse setBody(GetInstanceConsoleOutputResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceConsoleOutputResponseBody getBody() {
        return this.body;
    }

}
