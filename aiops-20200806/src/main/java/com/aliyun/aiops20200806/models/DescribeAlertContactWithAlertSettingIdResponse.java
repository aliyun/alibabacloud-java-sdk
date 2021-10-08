// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeAlertContactWithAlertSettingIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeAlertContactWithAlertSettingIdResponse setBody(DescribeAlertContactWithAlertSettingIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAlertContactWithAlertSettingIdResponseBody getBody() {
        return this.body;
    }

}
