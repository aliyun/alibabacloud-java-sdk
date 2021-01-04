// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class DescribeScheduleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScheduleResponseBody body;

    public static DescribeScheduleResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScheduleResponse self = new DescribeScheduleResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScheduleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScheduleResponse setBody(DescribeScheduleResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScheduleResponseBody getBody() {
        return this.body;
    }

}
