// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeAlertSettingByIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAlertSettingByIdResponseBody body;

    public static DescribeAlertSettingByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertSettingByIdResponse self = new DescribeAlertSettingByIdResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAlertSettingByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAlertSettingByIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAlertSettingByIdResponse setBody(DescribeAlertSettingByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAlertSettingByIdResponseBody getBody() {
        return this.body;
    }

}
