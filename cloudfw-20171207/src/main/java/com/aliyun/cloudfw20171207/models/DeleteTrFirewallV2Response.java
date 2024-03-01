// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteTrFirewallV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteTrFirewallV2ResponseBody body;

    public static DeleteTrFirewallV2Response build(java.util.Map<String, ?> map) throws Exception {
        DeleteTrFirewallV2Response self = new DeleteTrFirewallV2Response();
        return TeaModel.build(map, self);
    }

    public DeleteTrFirewallV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTrFirewallV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTrFirewallV2Response setBody(DeleteTrFirewallV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTrFirewallV2ResponseBody getBody() {
        return this.body;
    }

}
