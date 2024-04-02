// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeNotificationSettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNotificationSettingResponseBody body;

    public static DescribeNotificationSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNotificationSettingResponse self = new DescribeNotificationSettingResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNotificationSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNotificationSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNotificationSettingResponse setBody(DescribeNotificationSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNotificationSettingResponseBody getBody() {
        return this.body;
    }

}
