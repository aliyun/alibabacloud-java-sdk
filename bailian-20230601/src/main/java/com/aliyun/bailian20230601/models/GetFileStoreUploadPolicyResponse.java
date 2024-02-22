// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class GetFileStoreUploadPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFileStoreUploadPolicyResponseBody body;

    public static GetFileStoreUploadPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFileStoreUploadPolicyResponse self = new GetFileStoreUploadPolicyResponse();
        return TeaModel.build(map, self);
    }

    public GetFileStoreUploadPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFileStoreUploadPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFileStoreUploadPolicyResponse setBody(GetFileStoreUploadPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFileStoreUploadPolicyResponseBody getBody() {
        return this.body;
    }

}
