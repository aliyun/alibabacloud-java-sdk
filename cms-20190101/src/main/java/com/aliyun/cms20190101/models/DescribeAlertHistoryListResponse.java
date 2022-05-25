// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeAlertHistoryListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAlertHistoryListResponseBody body;

    public static DescribeAlertHistoryListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertHistoryListResponse self = new DescribeAlertHistoryListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAlertHistoryListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAlertHistoryListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAlertHistoryListResponse setBody(DescribeAlertHistoryListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAlertHistoryListResponseBody getBody() {
        return this.body;
    }

}
