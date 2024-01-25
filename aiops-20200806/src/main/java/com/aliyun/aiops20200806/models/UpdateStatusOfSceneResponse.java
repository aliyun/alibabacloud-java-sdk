// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class UpdateStatusOfSceneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateStatusOfSceneResponseBody body;

    public static UpdateStatusOfSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateStatusOfSceneResponse self = new UpdateStatusOfSceneResponse();
        return TeaModel.build(map, self);
    }

    public UpdateStatusOfSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateStatusOfSceneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateStatusOfSceneResponse setBody(UpdateStatusOfSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateStatusOfSceneResponseBody getBody() {
        return this.body;
    }

}
