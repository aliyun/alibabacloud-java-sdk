// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class NotifyPreOssUploadCompleteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public NotifyPreOssUploadCompleteResponseBody body;

    public static NotifyPreOssUploadCompleteResponse build(java.util.Map<String, ?> map) throws Exception {
        NotifyPreOssUploadCompleteResponse self = new NotifyPreOssUploadCompleteResponse();
        return TeaModel.build(map, self);
    }

    public NotifyPreOssUploadCompleteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public NotifyPreOssUploadCompleteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public NotifyPreOssUploadCompleteResponse setBody(NotifyPreOssUploadCompleteResponseBody body) {
        this.body = body;
        return this;
    }
    public NotifyPreOssUploadCompleteResponseBody getBody() {
        return this.body;
    }

}
