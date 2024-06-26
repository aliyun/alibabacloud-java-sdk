// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeLatest15TransDigestsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLatest15TransDigestsResponseBody body;

    public static DescribeLatest15TransDigestsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLatest15TransDigestsResponse self = new DescribeLatest15TransDigestsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLatest15TransDigestsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLatest15TransDigestsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLatest15TransDigestsResponse setBody(DescribeLatest15TransDigestsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLatest15TransDigestsResponseBody getBody() {
        return this.body;
    }

}
