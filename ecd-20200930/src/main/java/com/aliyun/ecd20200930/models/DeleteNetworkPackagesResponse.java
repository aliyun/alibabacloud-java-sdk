// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteNetworkPackagesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteNetworkPackagesResponseBody body;

    public static DeleteNetworkPackagesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkPackagesResponse self = new DeleteNetworkPackagesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkPackagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteNetworkPackagesResponse setBody(DeleteNetworkPackagesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNetworkPackagesResponseBody getBody() {
        return this.body;
    }

}
