// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeContainerGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeContainerGroupsResponseBody body;

    public static DescribeContainerGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerGroupsResponse self = new DescribeContainerGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeContainerGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeContainerGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeContainerGroupsResponse setBody(DescribeContainerGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeContainerGroupsResponseBody getBody() {
        return this.body;
    }

}
