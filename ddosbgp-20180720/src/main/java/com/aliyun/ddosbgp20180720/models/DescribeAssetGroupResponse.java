// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeAssetGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAssetGroupResponseBody body;

    public static DescribeAssetGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAssetGroupResponse self = new DescribeAssetGroupResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAssetGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAssetGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAssetGroupResponse setBody(DescribeAssetGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAssetGroupResponseBody getBody() {
        return this.body;
    }

}
