// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DownloadSignedDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DownloadSignedDataResponseBody body;

    public static DownloadSignedDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadSignedDataResponse self = new DownloadSignedDataResponse();
        return TeaModel.build(map, self);
    }

    public DownloadSignedDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadSignedDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DownloadSignedDataResponse setBody(DownloadSignedDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadSignedDataResponseBody getBody() {
        return this.body;
    }

}
