// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAssetStatisticResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAssetStatisticResponseBody body;

    public static DescribeAssetStatisticResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAssetStatisticResponse self = new DescribeAssetStatisticResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAssetStatisticResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAssetStatisticResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAssetStatisticResponse setBody(DescribeAssetStatisticResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAssetStatisticResponseBody getBody() {
        return this.body;
    }

}
