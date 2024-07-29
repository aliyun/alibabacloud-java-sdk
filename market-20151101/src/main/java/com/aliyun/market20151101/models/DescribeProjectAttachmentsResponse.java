// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeProjectAttachmentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeProjectAttachmentsResponseBody body;

    public static DescribeProjectAttachmentsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeProjectAttachmentsResponse self = new DescribeProjectAttachmentsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeProjectAttachmentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeProjectAttachmentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeProjectAttachmentsResponse setBody(DescribeProjectAttachmentsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeProjectAttachmentsResponseBody getBody() {
        return this.body;
    }

}
