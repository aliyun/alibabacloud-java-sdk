// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class DeleteRcuSceneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteRcuSceneResponseBody body;

    public static DeleteRcuSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRcuSceneResponse self = new DeleteRcuSceneResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRcuSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRcuSceneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRcuSceneResponse setBody(DeleteRcuSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRcuSceneResponseBody getBody() {
        return this.body;
    }

}
