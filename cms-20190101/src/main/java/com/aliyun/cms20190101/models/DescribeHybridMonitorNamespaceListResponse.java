// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeHybridMonitorNamespaceListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHybridMonitorNamespaceListResponseBody body;

    public static DescribeHybridMonitorNamespaceListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridMonitorNamespaceListResponse self = new DescribeHybridMonitorNamespaceListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHybridMonitorNamespaceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHybridMonitorNamespaceListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHybridMonitorNamespaceListResponse setBody(DescribeHybridMonitorNamespaceListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHybridMonitorNamespaceListResponseBody getBody() {
        return this.body;
    }

}
