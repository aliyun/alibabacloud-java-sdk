// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dop20221130.models;

import com.aliyun.tea.*;

public class GetOssMetaDownloadResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOssMetaDownloadResponseBody body;

    public static GetOssMetaDownloadResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOssMetaDownloadResponse self = new GetOssMetaDownloadResponse();
        return TeaModel.build(map, self);
    }

    public GetOssMetaDownloadResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOssMetaDownloadResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOssMetaDownloadResponse setBody(GetOssMetaDownloadResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOssMetaDownloadResponseBody getBody() {
        return this.body;
    }

}
