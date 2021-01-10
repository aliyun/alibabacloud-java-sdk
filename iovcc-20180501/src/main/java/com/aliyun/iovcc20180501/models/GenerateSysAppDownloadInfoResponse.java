// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class GenerateSysAppDownloadInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GenerateSysAppDownloadInfoResponseBody body;

    public static GenerateSysAppDownloadInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateSysAppDownloadInfoResponse self = new GenerateSysAppDownloadInfoResponse();
        return TeaModel.build(map, self);
    }

    public GenerateSysAppDownloadInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateSysAppDownloadInfoResponse setBody(GenerateSysAppDownloadInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateSysAppDownloadInfoResponseBody getBody() {
        return this.body;
    }

}
