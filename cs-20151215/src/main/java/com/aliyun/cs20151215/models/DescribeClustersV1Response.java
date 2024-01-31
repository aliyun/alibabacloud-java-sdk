// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClustersV1Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeClustersV1ResponseBody body;

    public static DescribeClustersV1Response build(java.util.Map<String, ?> map) throws Exception {
        DescribeClustersV1Response self = new DescribeClustersV1Response();
        return TeaModel.build(map, self);
    }

    public DescribeClustersV1Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClustersV1Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeClustersV1Response setBody(DescribeClustersV1ResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClustersV1ResponseBody getBody() {
        return this.body;
    }

}
