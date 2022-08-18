// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmAvailableAlertGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGtmAvailableAlertGroupResponseBody body;

    public static DescribeGtmAvailableAlertGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmAvailableAlertGroupResponse self = new DescribeGtmAvailableAlertGroupResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGtmAvailableAlertGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGtmAvailableAlertGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGtmAvailableAlertGroupResponse setBody(DescribeGtmAvailableAlertGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGtmAvailableAlertGroupResponseBody getBody() {
        return this.body;
    }

}
