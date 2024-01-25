// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeAlertBusinessGroupWithAlertSettingIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeAlertBusinessGroupWithAlertSettingIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAlertBusinessGroupWithAlertSettingIdResponse setBody(DescribeAlertBusinessGroupWithAlertSettingIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAlertBusinessGroupWithAlertSettingIdResponseBody getBody() {
        return this.body;
    }

}
