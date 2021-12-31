// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeRenewalPriceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRenewalPriceResponseBody body;

    public static DescribeRenewalPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRenewalPriceResponse self = new DescribeRenewalPriceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRenewalPriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRenewalPriceResponse setBody(DescribeRenewalPriceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRenewalPriceResponseBody getBody() {
        return this.body;
    }

}
