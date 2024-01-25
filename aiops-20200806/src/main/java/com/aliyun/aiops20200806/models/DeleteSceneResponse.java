// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DeleteSceneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSceneResponseBody body;

    public static DeleteSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSceneResponse self = new DeleteSceneResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSceneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSceneResponse setBody(DeleteSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSceneResponseBody getBody() {
        return this.body;
    }

}
