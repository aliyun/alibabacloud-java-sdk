// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetFileStorageCredentialResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFileStorageCredentialResponseBody body;

    public static GetFileStorageCredentialResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFileStorageCredentialResponse self = new GetFileStorageCredentialResponse();
        return TeaModel.build(map, self);
    }

    public GetFileStorageCredentialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFileStorageCredentialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFileStorageCredentialResponse setBody(GetFileStorageCredentialResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFileStorageCredentialResponseBody getBody() {
        return this.body;
    }

}
