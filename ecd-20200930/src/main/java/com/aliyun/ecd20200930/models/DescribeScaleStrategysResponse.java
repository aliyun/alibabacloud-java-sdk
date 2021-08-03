// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeScaleStrategysResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScaleStrategysResponseBody body;

    public static DescribeScaleStrategysResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScaleStrategysResponse self = new DescribeScaleStrategysResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScaleStrategysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScaleStrategysResponse setBody(DescribeScaleStrategysResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScaleStrategysResponseBody getBody() {
        return this.body;
    }

}
