// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DownloadPrivacyKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DownloadPrivacyKeyResponseBody body;

    public static DownloadPrivacyKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadPrivacyKeyResponse self = new DownloadPrivacyKeyResponse();
        return TeaModel.build(map, self);
    }

    public DownloadPrivacyKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadPrivacyKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DownloadPrivacyKeyResponse setBody(DownloadPrivacyKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadPrivacyKeyResponseBody getBody() {
        return this.body;
    }

}
