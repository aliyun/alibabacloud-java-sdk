// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class DescribeScheduleMethodsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScheduleMethodsResponseBody body;

    public static DescribeScheduleMethodsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScheduleMethodsResponse self = new DescribeScheduleMethodsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScheduleMethodsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScheduleMethodsResponse setBody(DescribeScheduleMethodsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScheduleMethodsResponseBody getBody() {
        return this.body;
    }

}
