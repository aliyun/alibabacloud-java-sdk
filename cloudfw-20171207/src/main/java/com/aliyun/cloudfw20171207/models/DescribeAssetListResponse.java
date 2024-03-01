// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAssetListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAssetListResponseBody body;

    public static DescribeAssetListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAssetListResponse self = new DescribeAssetListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAssetListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAssetListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAssetListResponse setBody(DescribeAssetListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAssetListResponseBody getBody() {
        return this.body;
    }

}
