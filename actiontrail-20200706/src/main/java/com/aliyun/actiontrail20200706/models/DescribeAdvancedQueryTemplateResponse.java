// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class DescribeAdvancedQueryTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAdvancedQueryTemplateResponseBody body;

    public static DescribeAdvancedQueryTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdvancedQueryTemplateResponse self = new DescribeAdvancedQueryTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAdvancedQueryTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAdvancedQueryTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAdvancedQueryTemplateResponse setBody(DescribeAdvancedQueryTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAdvancedQueryTemplateResponseBody getBody() {
        return this.body;
    }

}
