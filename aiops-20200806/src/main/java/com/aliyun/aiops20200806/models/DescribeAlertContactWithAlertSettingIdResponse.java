// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeAlertContactWithAlertSettingIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAlertContactWithAlertSettingIdResponseBody body;

    public static DescribeAlertContactWithAlertSettingIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertContactWithAlertSettingIdResponse self = new DescribeAlertContactWithAlertSettingIdResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAlertContactWithAlertSettingIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAlertContactWithAlertSettingIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAlertContactWithAlertSettingIdResponse setBody(DescribeAlertContactWithAlertSettingIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAlertContactWithAlertSettingIdResponseBody getBody() {
        return this.body;
    }

}
