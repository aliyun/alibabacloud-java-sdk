// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class CreateNamespaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateNamespaceResponseBody body;

    public static CreateNamespaceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNamespaceResponse self = new CreateNamespaceResponse();
        return TeaModel.build(map, self);
    }

    public CreateNamespaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateNamespaceResponse setBody(CreateNamespaceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateNamespaceResponseBody getBody() {
        return this.body;
    }

}
