// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAddressBookResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAddressBookResponseBody body;

    public static DescribeAddressBookResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAddressBookResponse self = new DescribeAddressBookResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAddressBookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAddressBookResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAddressBookResponse setBody(DescribeAddressBookResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAddressBookResponseBody getBody() {
        return this.body;
    }

}
