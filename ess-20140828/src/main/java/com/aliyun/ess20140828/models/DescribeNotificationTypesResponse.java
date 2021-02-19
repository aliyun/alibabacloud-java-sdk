// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class DescribeNotificationTypesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeNotificationTypesResponseBody body;

    public static DescribeNotificationTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNotificationTypesResponse self = new DescribeNotificationTypesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNotificationTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNotificationTypesResponse setBody(DescribeNotificationTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNotificationTypesResponseBody getBody() {
        return this.body;
    }

}
