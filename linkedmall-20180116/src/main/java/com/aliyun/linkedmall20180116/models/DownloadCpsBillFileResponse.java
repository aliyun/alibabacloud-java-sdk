// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class DownloadCpsBillFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DownloadCpsBillFileResponseBody body;

    public static DownloadCpsBillFileResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadCpsBillFileResponse self = new DownloadCpsBillFileResponse();
        return TeaModel.build(map, self);
    }

    public DownloadCpsBillFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadCpsBillFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DownloadCpsBillFileResponse setBody(DownloadCpsBillFileResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadCpsBillFileResponseBody getBody() {
        return this.body;
    }

}
