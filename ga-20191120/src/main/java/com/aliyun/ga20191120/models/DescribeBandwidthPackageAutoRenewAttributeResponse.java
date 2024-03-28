// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeBandwidthPackageAutoRenewAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBandwidthPackageAutoRenewAttributeResponseBody body;

    public static DescribeBandwidthPackageAutoRenewAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBandwidthPackageAutoRenewAttributeResponse self = new DescribeBandwidthPackageAutoRenewAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBandwidthPackageAutoRenewAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBandwidthPackageAutoRenewAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBandwidthPackageAutoRenewAttributeResponse setBody(DescribeBandwidthPackageAutoRenewAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBandwidthPackageAutoRenewAttributeResponseBody getBody() {
        return this.body;
    }

}
