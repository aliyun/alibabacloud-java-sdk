// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeGrantRulesToResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeGrantRulesToResourceResponseBody body;

    public static DescribeGrantRulesToResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGrantRulesToResourceResponse self = new DescribeGrantRulesToResourceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGrantRulesToResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGrantRulesToResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGrantRulesToResourceResponse setBody(DescribeGrantRulesToResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGrantRulesToResourceResponseBody getBody() {
        return this.body;
    }

}
