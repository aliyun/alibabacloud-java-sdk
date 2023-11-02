// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeOperatorsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeOperatorsResponseBody body;

    public static DescribeOperatorsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOperatorsResponse self = new DescribeOperatorsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOperatorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOperatorsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOperatorsResponse setBody(DescribeOperatorsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOperatorsResponseBody getBody() {
        return this.body;
    }

}
