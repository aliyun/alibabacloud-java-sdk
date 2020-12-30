// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class DescribeRestoreRangeInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRestoreRangeInfoResponseBody body;

    public static DescribeRestoreRangeInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRestoreRangeInfoResponse self = new DescribeRestoreRangeInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRestoreRangeInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRestoreRangeInfoResponse setBody(DescribeRestoreRangeInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRestoreRangeInfoResponseBody getBody() {
        return this.body;
    }

}
