// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class DescribeReadOnlyAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeReadOnlyAccountResponseBody body;

    public static DescribeReadOnlyAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeReadOnlyAccountResponse self = new DescribeReadOnlyAccountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeReadOnlyAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeReadOnlyAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeReadOnlyAccountResponse setBody(DescribeReadOnlyAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeReadOnlyAccountResponseBody getBody() {
        return this.body;
    }

}
