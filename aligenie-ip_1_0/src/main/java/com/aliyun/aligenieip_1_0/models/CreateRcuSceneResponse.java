// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class CreateRcuSceneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRcuSceneResponseBody body;

    public static CreateRcuSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRcuSceneResponse self = new CreateRcuSceneResponse();
        return TeaModel.build(map, self);
    }

    public CreateRcuSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRcuSceneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRcuSceneResponse setBody(CreateRcuSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRcuSceneResponseBody getBody() {
        return this.body;
    }

}
