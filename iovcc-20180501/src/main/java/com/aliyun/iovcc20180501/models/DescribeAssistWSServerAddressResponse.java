// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeAssistWSServerAddressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAssistWSServerAddressResponseBody body;

    public static DescribeAssistWSServerAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAssistWSServerAddressResponse self = new DescribeAssistWSServerAddressResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAssistWSServerAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAssistWSServerAddressResponse setBody(DescribeAssistWSServerAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAssistWSServerAddressResponseBody getBody() {
        return this.body;
    }

}
