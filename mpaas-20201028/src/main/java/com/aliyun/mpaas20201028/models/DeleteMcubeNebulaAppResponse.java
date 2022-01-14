// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class DeleteMcubeNebulaAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMcubeNebulaAppResponseBody body;

    public static DeleteMcubeNebulaAppResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMcubeNebulaAppResponse self = new DeleteMcubeNebulaAppResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMcubeNebulaAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMcubeNebulaAppResponse setBody(DeleteMcubeNebulaAppResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMcubeNebulaAppResponseBody getBody() {
        return this.body;
    }

}
