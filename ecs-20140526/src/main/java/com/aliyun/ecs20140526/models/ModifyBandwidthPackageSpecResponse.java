// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyBandwidthPackageSpecResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyBandwidthPackageSpecResponseBody body;

    public static ModifyBandwidthPackageSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyBandwidthPackageSpecResponse self = new ModifyBandwidthPackageSpecResponse();
        return TeaModel.build(map, self);
    }

    public ModifyBandwidthPackageSpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyBandwidthPackageSpecResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyBandwidthPackageSpecResponse setBody(ModifyBandwidthPackageSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyBandwidthPackageSpecResponseBody getBody() {
        return this.body;
    }

}
