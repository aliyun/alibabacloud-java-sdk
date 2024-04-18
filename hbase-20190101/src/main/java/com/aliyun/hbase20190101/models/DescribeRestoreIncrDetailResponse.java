// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeRestoreIncrDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeRestoreIncrDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRestoreIncrDetailResponse setBody(DescribeRestoreIncrDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRestoreIncrDetailResponseBody getBody() {
        return this.body;
    }

}
