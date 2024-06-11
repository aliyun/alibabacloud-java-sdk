// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeAndroidInstanceGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAndroidInstanceGroupsResponseBody body;

    public static DescribeAndroidInstanceGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAndroidInstanceGroupsResponse self = new DescribeAndroidInstanceGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAndroidInstanceGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAndroidInstanceGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAndroidInstanceGroupsResponse setBody(DescribeAndroidInstanceGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAndroidInstanceGroupsResponseBody getBody() {
        return this.body;
    }

}
