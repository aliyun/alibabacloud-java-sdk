// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DownloadCdsFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DownloadCdsFileResponseBody body;

    public static DownloadCdsFileResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadCdsFileResponse self = new DownloadCdsFileResponse();
        return TeaModel.build(map, self);
    }

    public DownloadCdsFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadCdsFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DownloadCdsFileResponse setBody(DownloadCdsFileResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadCdsFileResponseBody getBody() {
        return this.body;
    }

}
