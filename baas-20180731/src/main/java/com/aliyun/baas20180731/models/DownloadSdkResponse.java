// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DownloadSdkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DownloadSdkResponseBody body;

    public static DownloadSdkResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadSdkResponse self = new DownloadSdkResponse();
        return TeaModel.build(map, self);
    }

    public DownloadSdkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadSdkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DownloadSdkResponse setBody(DownloadSdkResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadSdkResponseBody getBody() {
        return this.body;
    }

}
