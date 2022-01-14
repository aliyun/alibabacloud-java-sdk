// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class DownloadMPCDPrivacyDocByIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DownloadMPCDPrivacyDocByIdResponseBody body;

    public static DownloadMPCDPrivacyDocByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadMPCDPrivacyDocByIdResponse self = new DownloadMPCDPrivacyDocByIdResponse();
        return TeaModel.build(map, self);
    }

    public DownloadMPCDPrivacyDocByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadMPCDPrivacyDocByIdResponse setBody(DownloadMPCDPrivacyDocByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadMPCDPrivacyDocByIdResponseBody getBody() {
        return this.body;
    }

}
