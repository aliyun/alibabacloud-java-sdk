// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsRegionIdIpv6InfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEnsRegionIdIpv6InfoResponseBody body;

    public static DescribeEnsRegionIdIpv6InfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnsRegionIdIpv6InfoResponse self = new DescribeEnsRegionIdIpv6InfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEnsRegionIdIpv6InfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEnsRegionIdIpv6InfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEnsRegionIdIpv6InfoResponse setBody(DescribeEnsRegionIdIpv6InfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEnsRegionIdIpv6InfoResponseBody getBody() {
        return this.body;
    }

}
