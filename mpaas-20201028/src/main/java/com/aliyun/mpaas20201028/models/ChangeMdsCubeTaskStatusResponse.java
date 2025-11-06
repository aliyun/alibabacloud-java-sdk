// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ChangeMdsCubeTaskStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChangeMdsCubeTaskStatusResponseBody body;

    public static ChangeMdsCubeTaskStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeMdsCubeTaskStatusResponse self = new ChangeMdsCubeTaskStatusResponse();
        return TeaModel.build(map, self);
    }

    public ChangeMdsCubeTaskStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeMdsCubeTaskStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeMdsCubeTaskStatusResponse setBody(ChangeMdsCubeTaskStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeMdsCubeTaskStatusResponseBody getBody() {
        return this.body;
    }

}
