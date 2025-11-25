// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallAssetListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVpcFirewallAssetListResponseBody body;

    public static DescribeVpcFirewallAssetListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallAssetListResponse self = new DescribeVpcFirewallAssetListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallAssetListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVpcFirewallAssetListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVpcFirewallAssetListResponse setBody(DescribeVpcFirewallAssetListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVpcFirewallAssetListResponseBody getBody() {
        return this.body;
    }

}
