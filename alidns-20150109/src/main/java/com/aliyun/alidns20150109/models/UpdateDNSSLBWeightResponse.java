// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDNSSLBWeightResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDNSSLBWeightResponseBody body;

    public static UpdateDNSSLBWeightResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDNSSLBWeightResponse self = new UpdateDNSSLBWeightResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDNSSLBWeightResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDNSSLBWeightResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDNSSLBWeightResponse setBody(UpdateDNSSLBWeightResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDNSSLBWeightResponseBody getBody() {
        return this.body;
    }

}
