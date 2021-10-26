// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeConflictApisResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeConflictApisResponseBody body;

    public static DescribeConflictApisResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeConflictApisResponse self = new DescribeConflictApisResponse();
        return TeaModel.build(map, self);
    }

    public DescribeConflictApisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeConflictApisResponse setBody(DescribeConflictApisResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeConflictApisResponseBody getBody() {
        return this.body;
    }

}
