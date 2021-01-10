// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class GenerateSdkDownloadInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GenerateSdkDownloadInfoResponseBody body;

    public static GenerateSdkDownloadInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateSdkDownloadInfoResponse self = new GenerateSdkDownloadInfoResponse();
        return TeaModel.build(map, self);
    }

    public GenerateSdkDownloadInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateSdkDownloadInfoResponse setBody(GenerateSdkDownloadInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateSdkDownloadInfoResponseBody getBody() {
        return this.body;
    }

}
