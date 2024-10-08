// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeHttpDDoSAttackProtectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHttpDDoSAttackProtectionResponseBody body;

    public static DescribeHttpDDoSAttackProtectionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHttpDDoSAttackProtectionResponse self = new DescribeHttpDDoSAttackProtectionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHttpDDoSAttackProtectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHttpDDoSAttackProtectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHttpDDoSAttackProtectionResponse setBody(DescribeHttpDDoSAttackProtectionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHttpDDoSAttackProtectionResponseBody getBody() {
        return this.body;
    }

}
