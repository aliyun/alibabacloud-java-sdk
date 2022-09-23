// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class DownloadCompleteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DownloadCompleteResponseBody body;

    public static DownloadCompleteResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadCompleteResponse self = new DownloadCompleteResponse();
        return TeaModel.build(map, self);
    }

    public DownloadCompleteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadCompleteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DownloadCompleteResponse setBody(DownloadCompleteResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadCompleteResponseBody getBody() {
        return this.body;
    }

}
