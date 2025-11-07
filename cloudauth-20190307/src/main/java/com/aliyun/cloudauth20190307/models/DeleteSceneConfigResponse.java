// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DeleteSceneConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSceneConfigResponseBody body;

    public static DeleteSceneConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSceneConfigResponse self = new DeleteSceneConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSceneConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSceneConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSceneConfigResponse setBody(DeleteSceneConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSceneConfigResponseBody getBody() {
        return this.body;
    }

}
