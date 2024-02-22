// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeHybridMonitorDataListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHybridMonitorDataListResponseBody body;

    public static DescribeHybridMonitorDataListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridMonitorDataListResponse self = new DescribeHybridMonitorDataListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHybridMonitorDataListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHybridMonitorDataListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHybridMonitorDataListResponse setBody(DescribeHybridMonitorDataListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHybridMonitorDataListResponseBody getBody() {
        return this.body;
    }

}
