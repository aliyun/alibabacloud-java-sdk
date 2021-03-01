// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetPackageStorageCredentialResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPackageStorageCredentialResponseBody body;

    public static GetPackageStorageCredentialResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPackageStorageCredentialResponse self = new GetPackageStorageCredentialResponse();
        return TeaModel.build(map, self);
    }

    public GetPackageStorageCredentialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPackageStorageCredentialResponse setBody(GetPackageStorageCredentialResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPackageStorageCredentialResponseBody getBody() {
        return this.body;
    }

}
