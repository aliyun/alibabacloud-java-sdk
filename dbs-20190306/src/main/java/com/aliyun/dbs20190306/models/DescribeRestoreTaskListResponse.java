// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class DescribeRestoreTaskListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRestoreTaskListResponseBody body;

    public static DescribeRestoreTaskListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRestoreTaskListResponse self = new DescribeRestoreTaskListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRestoreTaskListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRestoreTaskListResponse setBody(DescribeRestoreTaskListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRestoreTaskListResponseBody getBody() {
        return this.body;
    }

}
