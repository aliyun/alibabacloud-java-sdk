// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DownloadPrivacyKeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DownloadPrivacyKeyResponse setBody(DownloadPrivacyKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadPrivacyKeyResponseBody getBody() {
        return this.body;
    }

}
