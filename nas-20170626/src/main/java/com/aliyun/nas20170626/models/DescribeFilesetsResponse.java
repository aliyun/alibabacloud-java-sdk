// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeFilesetsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFilesetsResponseBody body;

    public static DescribeFilesetsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFilesetsResponse self = new DescribeFilesetsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFilesetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFilesetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFilesetsResponse setBody(DescribeFilesetsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFilesetsResponseBody getBody() {
        return this.body;
    }

}
