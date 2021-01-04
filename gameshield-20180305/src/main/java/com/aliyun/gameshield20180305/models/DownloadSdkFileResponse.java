// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DownloadSdkFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DownloadSdkFileResponseBody body;

    public static DownloadSdkFileResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadSdkFileResponse self = new DownloadSdkFileResponse();
        return TeaModel.build(map, self);
    }

    public DownloadSdkFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadSdkFileResponse setBody(DownloadSdkFileResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadSdkFileResponseBody getBody() {
        return this.body;
    }

}
