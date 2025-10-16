// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateNatFirewallPreCheckResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateNatFirewallPreCheckResponseBody body;

    public static CreateNatFirewallPreCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNatFirewallPreCheckResponse self = new CreateNatFirewallPreCheckResponse();
        return TeaModel.build(map, self);
    }

    public CreateNatFirewallPreCheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateNatFirewallPreCheckResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateNatFirewallPreCheckResponse setBody(CreateNatFirewallPreCheckResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateNatFirewallPreCheckResponseBody getBody() {
        return this.body;
    }

}
