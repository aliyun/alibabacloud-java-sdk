// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeMetaStatisticsPageListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMetaStatisticsPageListResponseBody body;

    public static DescribeMetaStatisticsPageListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetaStatisticsPageListResponse self = new DescribeMetaStatisticsPageListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMetaStatisticsPageListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMetaStatisticsPageListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMetaStatisticsPageListResponse setBody(DescribeMetaStatisticsPageListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMetaStatisticsPageListResponseBody getBody() {
        return this.body;
    }

}
