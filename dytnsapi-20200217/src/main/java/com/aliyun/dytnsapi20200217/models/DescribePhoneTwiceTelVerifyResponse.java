// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribePhoneTwiceTelVerifyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePhoneTwiceTelVerifyResponseBody body;

    public static DescribePhoneTwiceTelVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePhoneTwiceTelVerifyResponse self = new DescribePhoneTwiceTelVerifyResponse();
        return TeaModel.build(map, self);
    }

    public DescribePhoneTwiceTelVerifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePhoneTwiceTelVerifyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePhoneTwiceTelVerifyResponse setBody(DescribePhoneTwiceTelVerifyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePhoneTwiceTelVerifyResponseBody getBody() {
        return this.body;
    }

}
