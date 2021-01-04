// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DownloadAppKeyFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DownloadAppKeyFileResponseBody body;

    public static DownloadAppKeyFileResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadAppKeyFileResponse self = new DownloadAppKeyFileResponse();
        return TeaModel.build(map, self);
    }

    public DownloadAppKeyFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadAppKeyFileResponse setBody(DownloadAppKeyFileResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadAppKeyFileResponseBody getBody() {
        return this.body;
    }

}
