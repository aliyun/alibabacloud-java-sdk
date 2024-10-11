// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ModifySceneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySceneResponseBody body;

    public static ModifySceneResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySceneResponse self = new ModifySceneResponse();
        return TeaModel.build(map, self);
    }

    public ModifySceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySceneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySceneResponse setBody(ModifySceneResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySceneResponseBody getBody() {
        return this.body;
    }

}
