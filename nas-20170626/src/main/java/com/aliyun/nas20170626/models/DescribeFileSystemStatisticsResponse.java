// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeFileSystemStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFileSystemStatisticsResponseBody body;

    public static DescribeFileSystemStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFileSystemStatisticsResponse self = new DescribeFileSystemStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFileSystemStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFileSystemStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFileSystemStatisticsResponse setBody(DescribeFileSystemStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFileSystemStatisticsResponseBody getBody() {
        return this.body;
    }

}
