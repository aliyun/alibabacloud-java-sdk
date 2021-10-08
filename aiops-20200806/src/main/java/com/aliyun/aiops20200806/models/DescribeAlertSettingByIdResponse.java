// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeAlertSettingByIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeAlertSettingByIdResponse setBody(DescribeAlertSettingByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAlertSettingByIdResponseBody getBody() {
        return this.body;
    }

}
