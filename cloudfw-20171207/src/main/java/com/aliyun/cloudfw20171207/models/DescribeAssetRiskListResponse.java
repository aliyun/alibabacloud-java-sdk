// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAssetRiskListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAssetRiskListResponseBody body;

    public static DescribeAssetRiskListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAssetRiskListResponse self = new DescribeAssetRiskListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAssetRiskListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAssetRiskListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAssetRiskListResponse setBody(DescribeAssetRiskListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAssetRiskListResponseBody getBody() {
        return this.body;
    }

}
