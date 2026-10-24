// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csasedr20241122.models;

import com.aliyun.tea.*;

public class DescribeAssetScopeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAssetScopeResponseBody body;

    public static DescribeAssetScopeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAssetScopeResponse self = new DescribeAssetScopeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAssetScopeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAssetScopeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAssetScopeResponse setBody(DescribeAssetScopeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAssetScopeResponseBody getBody() {
        return this.body;
    }

}
