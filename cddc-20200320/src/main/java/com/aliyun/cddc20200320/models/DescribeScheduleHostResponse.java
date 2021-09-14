// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class DescribeScheduleHostResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScheduleHostResponseBody body;

    public static DescribeScheduleHostResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScheduleHostResponse self = new DescribeScheduleHostResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScheduleHostResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScheduleHostResponse setBody(DescribeScheduleHostResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScheduleHostResponseBody getBody() {
        return this.body;
    }

}
