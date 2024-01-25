// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class UpdateScenestatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateScenestatusResponseBody body;

    public static UpdateScenestatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateScenestatusResponse self = new UpdateScenestatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateScenestatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateScenestatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateScenestatusResponse setBody(UpdateScenestatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateScenestatusResponseBody getBody() {
        return this.body;
    }

}
