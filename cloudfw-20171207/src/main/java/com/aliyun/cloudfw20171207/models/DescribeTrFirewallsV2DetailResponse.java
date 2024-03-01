// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeTrFirewallsV2DetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTrFirewallsV2DetailResponseBody body;

    public static DescribeTrFirewallsV2DetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTrFirewallsV2DetailResponse self = new DescribeTrFirewallsV2DetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTrFirewallsV2DetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTrFirewallsV2DetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTrFirewallsV2DetailResponse setBody(DescribeTrFirewallsV2DetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTrFirewallsV2DetailResponseBody getBody() {
        return this.body;
    }

}
