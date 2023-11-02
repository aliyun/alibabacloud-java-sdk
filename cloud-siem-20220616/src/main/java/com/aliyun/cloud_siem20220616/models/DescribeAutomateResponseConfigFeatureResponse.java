// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeAutomateResponseConfigFeatureResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAutomateResponseConfigFeatureResponseBody body;

    public static DescribeAutomateResponseConfigFeatureResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutomateResponseConfigFeatureResponse self = new DescribeAutomateResponseConfigFeatureResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAutomateResponseConfigFeatureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAutomateResponseConfigFeatureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAutomateResponseConfigFeatureResponse setBody(DescribeAutomateResponseConfigFeatureResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAutomateResponseConfigFeatureResponseBody getBody() {
        return this.body;
    }

}
