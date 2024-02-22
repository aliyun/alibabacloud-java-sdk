// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeAttackTimeLineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAttackTimeLineResponseBody body;

    public static DescribeAttackTimeLineResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAttackTimeLineResponse self = new DescribeAttackTimeLineResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAttackTimeLineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAttackTimeLineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAttackTimeLineResponse setBody(DescribeAttackTimeLineResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAttackTimeLineResponseBody getBody() {
        return this.body;
    }

}
