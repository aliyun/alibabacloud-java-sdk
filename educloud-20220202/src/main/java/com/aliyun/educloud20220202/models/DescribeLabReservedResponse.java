// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.educloud20220202.models;

import com.aliyun.tea.*;

public class DescribeLabReservedResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLabReservedResponseBody body;

    public static DescribeLabReservedResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLabReservedResponse self = new DescribeLabReservedResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLabReservedResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLabReservedResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLabReservedResponse setBody(DescribeLabReservedResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLabReservedResponseBody getBody() {
        return this.body;
    }

}
