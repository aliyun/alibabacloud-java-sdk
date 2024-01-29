// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateEngineNamespaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateEngineNamespaceResponseBody body;

    public static CreateEngineNamespaceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEngineNamespaceResponse self = new CreateEngineNamespaceResponse();
        return TeaModel.build(map, self);
    }

    public CreateEngineNamespaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEngineNamespaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEngineNamespaceResponse setBody(CreateEngineNamespaceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEngineNamespaceResponseBody getBody() {
        return this.body;
    }

}
