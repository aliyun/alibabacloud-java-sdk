// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeAtiAlertSettingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAtiAlertSettingsResponseBody body;

    public static DescribeAtiAlertSettingsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAtiAlertSettingsResponse self = new DescribeAtiAlertSettingsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAtiAlertSettingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAtiAlertSettingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAtiAlertSettingsResponse setBody(DescribeAtiAlertSettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAtiAlertSettingsResponseBody getBody() {
        return this.body;
    }

}
