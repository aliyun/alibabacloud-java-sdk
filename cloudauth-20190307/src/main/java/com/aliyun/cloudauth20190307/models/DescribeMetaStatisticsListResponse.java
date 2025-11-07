// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeMetaStatisticsListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMetaStatisticsListResponseBody body;

    public static DescribeMetaStatisticsListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetaStatisticsListResponse self = new DescribeMetaStatisticsListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMetaStatisticsListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMetaStatisticsListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMetaStatisticsListResponse setBody(DescribeMetaStatisticsListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMetaStatisticsListResponseBody getBody() {
        return this.body;
    }

}
