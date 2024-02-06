// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeLoadTasksRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLoadTasksRecordsResponseBody body;

    public static DescribeLoadTasksRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoadTasksRecordsResponse self = new DescribeLoadTasksRecordsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLoadTasksRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLoadTasksRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLoadTasksRecordsResponse setBody(DescribeLoadTasksRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLoadTasksRecordsResponseBody getBody() {
        return this.body;
    }

}
