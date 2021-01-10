// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class UpdateNamespaceDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateNamespaceDataResponseBody body;

    public static UpdateNamespaceDataResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateNamespaceDataResponse self = new UpdateNamespaceDataResponse();
        return TeaModel.build(map, self);
    }

    public UpdateNamespaceDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateNamespaceDataResponse setBody(UpdateNamespaceDataResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateNamespaceDataResponseBody getBody() {
        return this.body;
    }

}
