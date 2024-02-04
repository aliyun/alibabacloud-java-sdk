// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetOSSBucketAttachmentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOSSBucketAttachmentResponseBody body;

    public static GetOSSBucketAttachmentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOSSBucketAttachmentResponse self = new GetOSSBucketAttachmentResponse();
        return TeaModel.build(map, self);
    }

    public GetOSSBucketAttachmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOSSBucketAttachmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOSSBucketAttachmentResponse setBody(GetOSSBucketAttachmentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOSSBucketAttachmentResponseBody getBody() {
        return this.body;
    }

}
