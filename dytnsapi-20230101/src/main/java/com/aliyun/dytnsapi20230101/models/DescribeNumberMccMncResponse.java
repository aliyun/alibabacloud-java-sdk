// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20230101.models;

import com.aliyun.tea.*;

public class DescribeNumberMccMncResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNumberMccMncResponseBody body;

    public static DescribeNumberMccMncResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNumberMccMncResponse self = new DescribeNumberMccMncResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNumberMccMncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNumberMccMncResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNumberMccMncResponse setBody(DescribeNumberMccMncResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNumberMccMncResponseBody getBody() {
        return this.body;
    }

}
