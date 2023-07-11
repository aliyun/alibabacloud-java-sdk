// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class UpdateRcuSceneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateRcuSceneResponseBody body;

    public static UpdateRcuSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRcuSceneResponse self = new UpdateRcuSceneResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRcuSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRcuSceneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRcuSceneResponse setBody(UpdateRcuSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRcuSceneResponseBody getBody() {
        return this.body;
    }

}
