// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeAlertBusinessGroupWithAlertSettingIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAlertBusinessGroupWithAlertSettingIdResponseBody body;

    public static DescribeAlertBusinessGroupWithAlertSettingIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertBusinessGroupWithAlertSettingIdResponse self = new DescribeAlertBusinessGroupWithAlertSettingIdResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAlertBusinessGroupWithAlertSettingIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAlertBusinessGroupWithAlertSettingIdResponse setBody(DescribeAlertBusinessGroupWithAlertSettingIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAlertBusinessGroupWithAlertSettingIdResponseBody getBody() {
        return this.body;
    }

}
