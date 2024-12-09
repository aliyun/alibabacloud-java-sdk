// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeHistoryEventsStatResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHistoryEventsStatResponseBody body;

    public static DescribeHistoryEventsStatResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHistoryEventsStatResponse self = new DescribeHistoryEventsStatResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHistoryEventsStatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHistoryEventsStatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHistoryEventsStatResponse setBody(DescribeHistoryEventsStatResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHistoryEventsStatResponseBody getBody() {
        return this.body;
    }

}
