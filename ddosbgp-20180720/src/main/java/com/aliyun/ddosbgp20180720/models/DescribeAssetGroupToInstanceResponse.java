// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeAssetGroupToInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAssetGroupToInstanceResponseBody body;

    public static DescribeAssetGroupToInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAssetGroupToInstanceResponse self = new DescribeAssetGroupToInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAssetGroupToInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAssetGroupToInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAssetGroupToInstanceResponse setBody(DescribeAssetGroupToInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAssetGroupToInstanceResponseBody getBody() {
        return this.body;
    }

}
