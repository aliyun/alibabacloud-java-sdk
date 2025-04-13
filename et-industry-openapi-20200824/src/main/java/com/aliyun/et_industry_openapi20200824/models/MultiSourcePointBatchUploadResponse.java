// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.et_industry_openapi20200824.models;

import com.aliyun.tea.*;

public class MultiSourcePointBatchUploadResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MultiSourcePointBatchUploadResponseBody body;

    public static MultiSourcePointBatchUploadResponse build(java.util.Map<String, ?> map) throws Exception {
        MultiSourcePointBatchUploadResponse self = new MultiSourcePointBatchUploadResponse();
        return TeaModel.build(map, self);
    }

    public MultiSourcePointBatchUploadResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MultiSourcePointBatchUploadResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MultiSourcePointBatchUploadResponse setBody(MultiSourcePointBatchUploadResponseBody body) {
        this.body = body;
        return this;
    }
    public MultiSourcePointBatchUploadResponseBody getBody() {
        return this.body;
    }

}
