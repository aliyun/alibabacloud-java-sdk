// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.et_industry_openapi20200824.models;

import com.aliyun.tea.*;

public class MultiFieldBatchUploadResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MultiFieldBatchUploadResponseBody body;

    public static MultiFieldBatchUploadResponse build(java.util.Map<String, ?> map) throws Exception {
        MultiFieldBatchUploadResponse self = new MultiFieldBatchUploadResponse();
        return TeaModel.build(map, self);
    }

    public MultiFieldBatchUploadResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MultiFieldBatchUploadResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MultiFieldBatchUploadResponse setBody(MultiFieldBatchUploadResponseBody body) {
        this.body = body;
        return this;
    }
    public MultiFieldBatchUploadResponseBody getBody() {
        return this.body;
    }

}
