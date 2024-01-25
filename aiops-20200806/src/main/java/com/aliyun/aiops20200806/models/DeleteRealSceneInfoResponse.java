// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DeleteRealSceneInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRealSceneInfoResponseBody body;

    public static DeleteRealSceneInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRealSceneInfoResponse self = new DeleteRealSceneInfoResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRealSceneInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRealSceneInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRealSceneInfoResponse setBody(DeleteRealSceneInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRealSceneInfoResponseBody getBody() {
        return this.body;
    }

}
