// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribePageDocumentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePageDocumentsResponseBody body;

    public static DescribePageDocumentsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePageDocumentsResponse self = new DescribePageDocumentsResponse();
        return TeaModel.build(map, self);
    }

    public DescribePageDocumentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePageDocumentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePageDocumentsResponse setBody(DescribePageDocumentsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePageDocumentsResponseBody getBody() {
        return this.body;
    }

}
