// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class DescribeAlarmHistoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAlarmHistoryResponseBody body;

    public static DescribeAlarmHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlarmHistoryResponse self = new DescribeAlarmHistoryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAlarmHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAlarmHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAlarmHistoryResponse setBody(DescribeAlarmHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAlarmHistoryResponseBody getBody() {
        return this.body;
    }

}
