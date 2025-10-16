// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeOutgoingAssetListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOutgoingAssetListResponseBody body;

    public static DescribeOutgoingAssetListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOutgoingAssetListResponse self = new DescribeOutgoingAssetListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOutgoingAssetListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOutgoingAssetListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOutgoingAssetListResponse setBody(DescribeOutgoingAssetListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOutgoingAssetListResponseBody getBody() {
        return this.body;
    }

}
