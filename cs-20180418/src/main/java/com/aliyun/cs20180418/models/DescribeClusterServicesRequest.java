// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20180418.models;

import com.aliyun.tea.*;

public class DescribeClusterServicesRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    public static DescribeClusterServicesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterServicesRequest self = new DescribeClusterServicesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterServicesRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
