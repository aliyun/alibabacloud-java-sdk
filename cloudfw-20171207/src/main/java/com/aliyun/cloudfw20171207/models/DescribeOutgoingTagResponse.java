// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeOutgoingTagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOutgoingTagResponseBody body;

    public static DescribeOutgoingTagResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOutgoingTagResponse self = new DescribeOutgoingTagResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOutgoingTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOutgoingTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOutgoingTagResponse setBody(DescribeOutgoingTagResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOutgoingTagResponseBody getBody() {
        return this.body;
    }

}
