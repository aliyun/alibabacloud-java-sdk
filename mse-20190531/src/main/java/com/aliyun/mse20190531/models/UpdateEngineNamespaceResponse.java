// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateEngineNamespaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateEngineNamespaceResponseBody body;

    public static UpdateEngineNamespaceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEngineNamespaceResponse self = new UpdateEngineNamespaceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEngineNamespaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEngineNamespaceResponse setBody(UpdateEngineNamespaceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEngineNamespaceResponseBody getBody() {
        return this.body;
    }

}
