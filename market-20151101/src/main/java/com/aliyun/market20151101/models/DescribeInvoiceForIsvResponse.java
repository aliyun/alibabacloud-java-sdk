// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeInvoiceForIsvResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInvoiceForIsvResponseBody body;

    public static DescribeInvoiceForIsvResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInvoiceForIsvResponse self = new DescribeInvoiceForIsvResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInvoiceForIsvResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInvoiceForIsvResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInvoiceForIsvResponse setBody(DescribeInvoiceForIsvResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInvoiceForIsvResponseBody getBody() {
        return this.body;
    }

}
