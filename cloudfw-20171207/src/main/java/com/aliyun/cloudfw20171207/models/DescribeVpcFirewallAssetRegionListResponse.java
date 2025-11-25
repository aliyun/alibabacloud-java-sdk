// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallAssetRegionListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVpcFirewallAssetRegionListResponseBody body;

    public static DescribeVpcFirewallAssetRegionListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallAssetRegionListResponse self = new DescribeVpcFirewallAssetRegionListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallAssetRegionListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVpcFirewallAssetRegionListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVpcFirewallAssetRegionListResponse setBody(DescribeVpcFirewallAssetRegionListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVpcFirewallAssetRegionListResponseBody getBody() {
        return this.body;
    }

}
