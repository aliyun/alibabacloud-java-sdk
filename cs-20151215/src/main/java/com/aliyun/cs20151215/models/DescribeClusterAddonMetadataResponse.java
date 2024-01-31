// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterAddonMetadataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeClusterAddonMetadataResponseBody body;

    public static DescribeClusterAddonMetadataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterAddonMetadataResponse self = new DescribeClusterAddonMetadataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterAddonMetadataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterAddonMetadataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeClusterAddonMetadataResponse setBody(DescribeClusterAddonMetadataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterAddonMetadataResponseBody getBody() {
        return this.body;
    }

}
