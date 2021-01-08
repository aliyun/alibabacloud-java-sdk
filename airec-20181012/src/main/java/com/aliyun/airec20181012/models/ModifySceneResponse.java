// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class ModifySceneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ModifySceneResponse setBody(ModifySceneResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySceneResponseBody getBody() {
        return this.body;
    }

}
