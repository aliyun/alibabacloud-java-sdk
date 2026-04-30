// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeJVSInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeJVSInstanceResponseBody body;

    public static DescribeJVSInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeJVSInstanceResponse self = new DescribeJVSInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeJVSInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeJVSInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeJVSInstanceResponse setBody(DescribeJVSInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeJVSInstanceResponseBody getBody() {
        return this.body;
    }

}
