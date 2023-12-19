// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeContainerClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeContainerClusterResponseBody body;

    public static DescribeContainerClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerClusterResponse self = new DescribeContainerClusterResponse();
        return TeaModel.build(map, self);
    }

    public DescribeContainerClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeContainerClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeContainerClusterResponse setBody(DescribeContainerClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeContainerClusterResponseBody getBody() {
        return this.body;
    }

}
