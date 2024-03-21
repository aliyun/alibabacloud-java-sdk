// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeHighlightInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHighlightInfoResponseBody body;

    public static DescribeHighlightInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHighlightInfoResponse self = new DescribeHighlightInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHighlightInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHighlightInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHighlightInfoResponse setBody(DescribeHighlightInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHighlightInfoResponseBody getBody() {
        return this.body;
    }

}
