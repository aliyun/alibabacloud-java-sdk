// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.globalsearch20210110.models;

import com.aliyun.tea.*;

public class DescribeReleasedResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeReleasedResourcesResponseBody body;

    public static DescribeReleasedResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeReleasedResourcesResponse self = new DescribeReleasedResourcesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeReleasedResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeReleasedResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeReleasedResourcesResponse setBody(DescribeReleasedResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeReleasedResourcesResponseBody getBody() {
        return this.body;
    }

}
