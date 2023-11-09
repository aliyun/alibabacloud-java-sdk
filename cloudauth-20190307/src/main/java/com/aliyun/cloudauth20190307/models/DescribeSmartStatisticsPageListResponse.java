// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeSmartStatisticsPageListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSmartStatisticsPageListResponseBody body;

    public static DescribeSmartStatisticsPageListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSmartStatisticsPageListResponse self = new DescribeSmartStatisticsPageListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSmartStatisticsPageListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSmartStatisticsPageListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSmartStatisticsPageListResponse setBody(DescribeSmartStatisticsPageListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSmartStatisticsPageListResponseBody getBody() {
        return this.body;
    }

}
