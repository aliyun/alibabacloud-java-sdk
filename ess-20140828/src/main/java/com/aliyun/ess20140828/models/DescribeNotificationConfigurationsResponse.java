// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class DescribeNotificationConfigurationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeNotificationConfigurationsResponseBody body;

    public static DescribeNotificationConfigurationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNotificationConfigurationsResponse self = new DescribeNotificationConfigurationsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNotificationConfigurationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNotificationConfigurationsResponse setBody(DescribeNotificationConfigurationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNotificationConfigurationsResponseBody getBody() {
        return this.body;
    }

}
