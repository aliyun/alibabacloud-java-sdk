// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetPackageStorageCredentialResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public GetPackageStorageCredentialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPackageStorageCredentialResponse setBody(GetPackageStorageCredentialResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPackageStorageCredentialResponseBody getBody() {
        return this.body;
    }

}
