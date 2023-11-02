// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeAutomateResponseConfigCounterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAutomateResponseConfigCounterResponseBody body;

    public static DescribeAutomateResponseConfigCounterResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutomateResponseConfigCounterResponse self = new DescribeAutomateResponseConfigCounterResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAutomateResponseConfigCounterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAutomateResponseConfigCounterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAutomateResponseConfigCounterResponse setBody(DescribeAutomateResponseConfigCounterResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAutomateResponseConfigCounterResponseBody getBody() {
        return this.body;
    }

}
