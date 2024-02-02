// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RemoveBandwidthPackageIpsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveBandwidthPackageIpsResponseBody body;

    public static RemoveBandwidthPackageIpsResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveBandwidthPackageIpsResponse self = new RemoveBandwidthPackageIpsResponse();
        return TeaModel.build(map, self);
    }

    public RemoveBandwidthPackageIpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveBandwidthPackageIpsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveBandwidthPackageIpsResponse setBody(RemoveBandwidthPackageIpsResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveBandwidthPackageIpsResponseBody getBody() {
        return this.body;
    }

}
