// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeTrFirewallsV2ListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTrFirewallsV2ListResponseBody body;

    public static DescribeTrFirewallsV2ListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTrFirewallsV2ListResponse self = new DescribeTrFirewallsV2ListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTrFirewallsV2ListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTrFirewallsV2ListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTrFirewallsV2ListResponse setBody(DescribeTrFirewallsV2ListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTrFirewallsV2ListResponseBody getBody() {
        return this.body;
    }

}
