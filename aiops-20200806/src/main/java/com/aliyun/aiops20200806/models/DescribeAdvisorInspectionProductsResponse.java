// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeAdvisorInspectionProductsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAdvisorInspectionProductsResponseBody body;

    public static DescribeAdvisorInspectionProductsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdvisorInspectionProductsResponse self = new DescribeAdvisorInspectionProductsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAdvisorInspectionProductsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAdvisorInspectionProductsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAdvisorInspectionProductsResponse setBody(DescribeAdvisorInspectionProductsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAdvisorInspectionProductsResponseBody getBody() {
        return this.body;
    }

}
