// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class DescribeScheduleInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScheduleInstanceResponseBody body;

    public static DescribeScheduleInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScheduleInstanceResponse self = new DescribeScheduleInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScheduleInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScheduleInstanceResponse setBody(DescribeScheduleInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScheduleInstanceResponseBody getBody() {
        return this.body;
    }

}
