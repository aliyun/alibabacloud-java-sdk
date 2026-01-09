// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallTrafficAssetListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVpcFirewallTrafficAssetListResponseBody body;

    public static DescribeVpcFirewallTrafficAssetListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallTrafficAssetListResponse self = new DescribeVpcFirewallTrafficAssetListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallTrafficAssetListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVpcFirewallTrafficAssetListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVpcFirewallTrafficAssetListResponse setBody(DescribeVpcFirewallTrafficAssetListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVpcFirewallTrafficAssetListResponseBody getBody() {
        return this.body;
    }

}
