// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeAlertSettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAlertSettingResponseBody body;

    public static DescribeAlertSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertSettingResponse self = new DescribeAlertSettingResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAlertSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAlertSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAlertSettingResponse setBody(DescribeAlertSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAlertSettingResponseBody getBody() {
        return this.body;
    }

}
