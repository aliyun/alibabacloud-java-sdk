// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class DedicatedIpAutoRenewalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DedicatedIpAutoRenewalResponseBody body;

    public static DedicatedIpAutoRenewalResponse build(java.util.Map<String, ?> map) throws Exception {
        DedicatedIpAutoRenewalResponse self = new DedicatedIpAutoRenewalResponse();
        return TeaModel.build(map, self);
    }

    public DedicatedIpAutoRenewalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DedicatedIpAutoRenewalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DedicatedIpAutoRenewalResponse setBody(DedicatedIpAutoRenewalResponseBody body) {
        this.body = body;
        return this;
    }
    public DedicatedIpAutoRenewalResponseBody getBody() {
        return this.body;
    }

}
