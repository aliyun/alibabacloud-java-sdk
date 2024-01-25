// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeInspectionResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInspectionResourcesResponseBody body;

    public static DescribeInspectionResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInspectionResourcesResponse self = new DescribeInspectionResourcesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInspectionResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInspectionResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInspectionResourcesResponse setBody(DescribeInspectionResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInspectionResourcesResponseBody getBody() {
        return this.body;
    }

}
