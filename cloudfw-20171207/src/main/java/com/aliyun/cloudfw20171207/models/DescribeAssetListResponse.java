// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAssetListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeAssetListResponse setBody(DescribeAssetListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAssetListResponseBody getBody() {
        return this.body;
    }

}
