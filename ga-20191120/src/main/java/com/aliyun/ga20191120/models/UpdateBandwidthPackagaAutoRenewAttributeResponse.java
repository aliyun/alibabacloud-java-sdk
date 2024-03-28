// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateBandwidthPackagaAutoRenewAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateBandwidthPackagaAutoRenewAttributeResponseBody body;

    public static UpdateBandwidthPackagaAutoRenewAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBandwidthPackagaAutoRenewAttributeResponse self = new UpdateBandwidthPackagaAutoRenewAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBandwidthPackagaAutoRenewAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateBandwidthPackagaAutoRenewAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateBandwidthPackagaAutoRenewAttributeResponse setBody(UpdateBandwidthPackagaAutoRenewAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateBandwidthPackagaAutoRenewAttributeResponseBody getBody() {
        return this.body;
    }

}
