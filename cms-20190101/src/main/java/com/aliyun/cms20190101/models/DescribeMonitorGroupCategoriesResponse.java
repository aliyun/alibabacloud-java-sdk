// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitorGroupCategoriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeMonitorGroupCategoriesResponse setBody(DescribeMonitorGroupCategoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMonitorGroupCategoriesResponseBody getBody() {
        return this.body;
    }

}
