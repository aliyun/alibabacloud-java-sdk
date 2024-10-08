// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeHttpDDoSAttackIntelligentProtectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHttpDDoSAttackIntelligentProtectionResponseBody body;

    public static DescribeHttpDDoSAttackIntelligentProtectionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHttpDDoSAttackIntelligentProtectionResponse self = new DescribeHttpDDoSAttackIntelligentProtectionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHttpDDoSAttackIntelligentProtectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHttpDDoSAttackIntelligentProtectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHttpDDoSAttackIntelligentProtectionResponse setBody(DescribeHttpDDoSAttackIntelligentProtectionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHttpDDoSAttackIntelligentProtectionResponseBody getBody() {
        return this.body;
    }

}
