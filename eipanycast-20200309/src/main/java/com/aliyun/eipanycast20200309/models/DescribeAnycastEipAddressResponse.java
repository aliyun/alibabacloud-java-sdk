// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.tea.*;

public class DescribeAnycastEipAddressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAnycastEipAddressResponseBody body;

    public static DescribeAnycastEipAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAnycastEipAddressResponse self = new DescribeAnycastEipAddressResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAnycastEipAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAnycastEipAddressResponse setBody(DescribeAnycastEipAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAnycastEipAddressResponseBody getBody() {
        return this.body;
    }

}
