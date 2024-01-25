// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DeleteSceneListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSceneListResponseBody body;

    public static DeleteSceneListResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSceneListResponse self = new DeleteSceneListResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSceneListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSceneListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSceneListResponse setBody(DeleteSceneListResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSceneListResponseBody getBody() {
        return this.body;
    }

}
