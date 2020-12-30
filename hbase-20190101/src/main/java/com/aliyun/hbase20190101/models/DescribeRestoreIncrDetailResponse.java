// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeRestoreIncrDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRestoreIncrDetailResponseBody body;

    public static DescribeRestoreIncrDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRestoreIncrDetailResponse self = new DescribeRestoreIncrDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRestoreIncrDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRestoreIncrDetailResponse setBody(DescribeRestoreIncrDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRestoreIncrDetailResponseBody getBody() {
        return this.body;
    }

}
