// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AddBandwidthPackageIpsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddBandwidthPackageIpsResponseBody body;

    public static AddBandwidthPackageIpsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddBandwidthPackageIpsResponse self = new AddBandwidthPackageIpsResponse();
        return TeaModel.build(map, self);
    }

    public AddBandwidthPackageIpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddBandwidthPackageIpsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddBandwidthPackageIpsResponse setBody(AddBandwidthPackageIpsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddBandwidthPackageIpsResponseBody getBody() {
        return this.body;
    }

}
