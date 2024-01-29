// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmRecoveryPlanAvailableConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeGtmRecoveryPlanAvailableConfigResponseBody body;

    public static DescribeGtmRecoveryPlanAvailableConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmRecoveryPlanAvailableConfigResponse self = new DescribeGtmRecoveryPlanAvailableConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGtmRecoveryPlanAvailableConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGtmRecoveryPlanAvailableConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGtmRecoveryPlanAvailableConfigResponse setBody(DescribeGtmRecoveryPlanAvailableConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGtmRecoveryPlanAvailableConfigResponseBody getBody() {
        return this.body;
    }

}
