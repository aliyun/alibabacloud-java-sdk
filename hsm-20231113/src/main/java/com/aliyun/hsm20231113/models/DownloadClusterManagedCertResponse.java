// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class DownloadClusterManagedCertResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DownloadClusterManagedCertResponseBody body;

    public static DownloadClusterManagedCertResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadClusterManagedCertResponse self = new DownloadClusterManagedCertResponse();
        return TeaModel.build(map, self);
    }

    public DownloadClusterManagedCertResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadClusterManagedCertResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DownloadClusterManagedCertResponse setBody(DownloadClusterManagedCertResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadClusterManagedCertResponseBody getBody() {
        return this.body;
    }

}
