// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class ConfigClusterCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfigClusterCertificateResponseBody body;

    public static ConfigClusterCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigClusterCertificateResponse self = new ConfigClusterCertificateResponse();
        return TeaModel.build(map, self);
    }

    public ConfigClusterCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigClusterCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigClusterCertificateResponse setBody(ConfigClusterCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigClusterCertificateResponseBody getBody() {
        return this.body;
    }

}
