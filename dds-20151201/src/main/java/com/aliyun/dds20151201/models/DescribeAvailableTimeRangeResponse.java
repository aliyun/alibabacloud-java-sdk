// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeAvailableTimeRangeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAvailableTimeRangeResponseBody body;

    public static DescribeAvailableTimeRangeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableTimeRangeResponse self = new DescribeAvailableTimeRangeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableTimeRangeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAvailableTimeRangeResponse setBody(DescribeAvailableTimeRangeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAvailableTimeRangeResponseBody getBody() {
        return this.body;
    }

}
