// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DeleteAntCloudAuthSceneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAntCloudAuthSceneResponseBody body;

    public static DeleteAntCloudAuthSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAntCloudAuthSceneResponse self = new DeleteAntCloudAuthSceneResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAntCloudAuthSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAntCloudAuthSceneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAntCloudAuthSceneResponse setBody(DeleteAntCloudAuthSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAntCloudAuthSceneResponseBody getBody() {
        return this.body;
    }

}
