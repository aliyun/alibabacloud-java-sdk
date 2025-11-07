// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class UpdateAntCloudAuthSceneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAntCloudAuthSceneResponseBody body;

    public static UpdateAntCloudAuthSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAntCloudAuthSceneResponse self = new UpdateAntCloudAuthSceneResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAntCloudAuthSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAntCloudAuthSceneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAntCloudAuthSceneResponse setBody(UpdateAntCloudAuthSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAntCloudAuthSceneResponseBody getBody() {
        return this.body;
    }

}
