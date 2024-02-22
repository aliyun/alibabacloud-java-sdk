// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeWafScopeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeWafScopeResponseBody body;

    public static DescribeWafScopeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWafScopeResponse self = new DescribeWafScopeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWafScopeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWafScopeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWafScopeResponse setBody(DescribeWafScopeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWafScopeResponseBody getBody() {
        return this.body;
    }

}
