// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeTrFirewallPolicyBackUpAssociationListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTrFirewallPolicyBackUpAssociationListResponseBody body;

    public static DescribeTrFirewallPolicyBackUpAssociationListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTrFirewallPolicyBackUpAssociationListResponse self = new DescribeTrFirewallPolicyBackUpAssociationListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTrFirewallPolicyBackUpAssociationListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTrFirewallPolicyBackUpAssociationListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTrFirewallPolicyBackUpAssociationListResponse setBody(DescribeTrFirewallPolicyBackUpAssociationListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTrFirewallPolicyBackUpAssociationListResponseBody getBody() {
        return this.body;
    }

}
