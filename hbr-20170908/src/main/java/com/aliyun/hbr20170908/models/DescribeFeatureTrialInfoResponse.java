// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeFeatureTrialInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFeatureTrialInfoResponseBody body;

    public static DescribeFeatureTrialInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFeatureTrialInfoResponse self = new DescribeFeatureTrialInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFeatureTrialInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFeatureTrialInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFeatureTrialInfoResponse setBody(DescribeFeatureTrialInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFeatureTrialInfoResponseBody getBody() {
        return this.body;
    }

}
