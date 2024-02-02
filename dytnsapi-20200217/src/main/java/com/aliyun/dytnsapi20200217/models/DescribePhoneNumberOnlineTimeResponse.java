// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribePhoneNumberOnlineTimeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePhoneNumberOnlineTimeResponseBody body;

    public static DescribePhoneNumberOnlineTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePhoneNumberOnlineTimeResponse self = new DescribePhoneNumberOnlineTimeResponse();
        return TeaModel.build(map, self);
    }

    public DescribePhoneNumberOnlineTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePhoneNumberOnlineTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePhoneNumberOnlineTimeResponse setBody(DescribePhoneNumberOnlineTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePhoneNumberOnlineTimeResponseBody getBody() {
        return this.body;
    }

}
