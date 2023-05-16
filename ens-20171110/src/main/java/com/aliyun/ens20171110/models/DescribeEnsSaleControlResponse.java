// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsSaleControlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeEnsSaleControlResponseBody body;

    public static DescribeEnsSaleControlResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnsSaleControlResponse self = new DescribeEnsSaleControlResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEnsSaleControlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEnsSaleControlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEnsSaleControlResponse setBody(DescribeEnsSaleControlResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEnsSaleControlResponseBody getBody() {
        return this.body;
    }

}
