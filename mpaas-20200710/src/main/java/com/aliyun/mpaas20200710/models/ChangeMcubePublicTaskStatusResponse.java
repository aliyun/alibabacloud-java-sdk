// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20200710.models;

import com.aliyun.tea.*;

public class ChangeMcubePublicTaskStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChangeMcubePublicTaskStatusResponseBody body;

    public static ChangeMcubePublicTaskStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeMcubePublicTaskStatusResponse self = new ChangeMcubePublicTaskStatusResponse();
        return TeaModel.build(map, self);
    }

    public ChangeMcubePublicTaskStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeMcubePublicTaskStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeMcubePublicTaskStatusResponse setBody(ChangeMcubePublicTaskStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeMcubePublicTaskStatusResponseBody getBody() {
        return this.body;
    }

}
