// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribePhoneNumberResaleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePhoneNumberResaleResponseBody body;

    public static DescribePhoneNumberResaleResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePhoneNumberResaleResponse self = new DescribePhoneNumberResaleResponse();
        return TeaModel.build(map, self);
    }

    public DescribePhoneNumberResaleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePhoneNumberResaleResponse setBody(DescribePhoneNumberResaleResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePhoneNumberResaleResponseBody getBody() {
        return this.body;
    }

}
