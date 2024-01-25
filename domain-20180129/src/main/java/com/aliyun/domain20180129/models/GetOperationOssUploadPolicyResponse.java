// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class GetOperationOssUploadPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOperationOssUploadPolicyResponseBody body;

    public static GetOperationOssUploadPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOperationOssUploadPolicyResponse self = new GetOperationOssUploadPolicyResponse();
        return TeaModel.build(map, self);
    }

    public GetOperationOssUploadPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOperationOssUploadPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOperationOssUploadPolicyResponse setBody(GetOperationOssUploadPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOperationOssUploadPolicyResponseBody getBody() {
        return this.body;
    }

}
