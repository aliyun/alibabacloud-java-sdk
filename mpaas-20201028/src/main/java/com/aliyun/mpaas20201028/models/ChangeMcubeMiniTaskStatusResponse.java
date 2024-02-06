// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ChangeMcubeMiniTaskStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChangeMcubeMiniTaskStatusResponseBody body;

    public static ChangeMcubeMiniTaskStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeMcubeMiniTaskStatusResponse self = new ChangeMcubeMiniTaskStatusResponse();
        return TeaModel.build(map, self);
    }

    public ChangeMcubeMiniTaskStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeMcubeMiniTaskStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeMcubeMiniTaskStatusResponse setBody(ChangeMcubeMiniTaskStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeMcubeMiniTaskStatusResponseBody getBody() {
        return this.body;
    }

}
