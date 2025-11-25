// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInternetSlbResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInternetSlbResponseBody body;

    public static DescribeInternetSlbResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInternetSlbResponse self = new DescribeInternetSlbResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInternetSlbResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInternetSlbResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInternetSlbResponse setBody(DescribeInternetSlbResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInternetSlbResponseBody getBody() {
        return this.body;
    }

}
