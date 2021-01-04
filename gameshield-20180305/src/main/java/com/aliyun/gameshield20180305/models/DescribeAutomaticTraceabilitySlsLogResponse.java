// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeAutomaticTraceabilitySlsLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAutomaticTraceabilitySlsLogResponseBody body;

    public static DescribeAutomaticTraceabilitySlsLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutomaticTraceabilitySlsLogResponse self = new DescribeAutomaticTraceabilitySlsLogResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAutomaticTraceabilitySlsLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAutomaticTraceabilitySlsLogResponse setBody(DescribeAutomaticTraceabilitySlsLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAutomaticTraceabilitySlsLogResponseBody getBody() {
        return this.body;
    }

}
