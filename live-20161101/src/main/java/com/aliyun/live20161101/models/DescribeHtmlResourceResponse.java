// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeHtmlResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeHtmlResourceResponseBody body;

    public static DescribeHtmlResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHtmlResourceResponse self = new DescribeHtmlResourceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHtmlResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHtmlResourceResponse setBody(DescribeHtmlResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHtmlResourceResponseBody getBody() {
        return this.body;
    }

}
