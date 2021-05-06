// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeLoadTasksRecordsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeLoadTasksRecordsResponse setBody(DescribeLoadTasksRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLoadTasksRecordsResponseBody getBody() {
        return this.body;
    }

}
