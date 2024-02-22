// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitorGroupCategoriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMonitorGroupCategoriesResponseBody body;

    public static DescribeMonitorGroupCategoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitorGroupCategoriesResponse self = new DescribeMonitorGroupCategoriesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMonitorGroupCategoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMonitorGroupCategoriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMonitorGroupCategoriesResponse setBody(DescribeMonitorGroupCategoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMonitorGroupCategoriesResponseBody getBody() {
        return this.body;
    }

}
