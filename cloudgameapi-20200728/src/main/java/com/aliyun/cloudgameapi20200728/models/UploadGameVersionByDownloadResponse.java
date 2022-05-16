// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class UploadGameVersionByDownloadResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UploadGameVersionByDownloadResponseBody body;

    public static UploadGameVersionByDownloadResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadGameVersionByDownloadResponse self = new UploadGameVersionByDownloadResponse();
        return TeaModel.build(map, self);
    }

    public UploadGameVersionByDownloadResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadGameVersionByDownloadResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadGameVersionByDownloadResponse setBody(UploadGameVersionByDownloadResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadGameVersionByDownloadResponseBody getBody() {
        return this.body;
    }

}
