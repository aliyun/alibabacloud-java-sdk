// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetNamespaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetNamespaceResponseBody body;

    public static GetNamespaceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNamespaceResponse self = new GetNamespaceResponse();
        return TeaModel.build(map, self);
    }

    public GetNamespaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNamespaceResponse setBody(GetNamespaceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNamespaceResponseBody getBody() {
        return this.body;
    }

}
