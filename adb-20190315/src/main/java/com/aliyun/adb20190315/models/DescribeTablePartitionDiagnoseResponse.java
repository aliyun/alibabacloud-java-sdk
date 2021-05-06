// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeTablePartitionDiagnoseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTablePartitionDiagnoseResponseBody body;

    public static DescribeTablePartitionDiagnoseResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTablePartitionDiagnoseResponse self = new DescribeTablePartitionDiagnoseResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTablePartitionDiagnoseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTablePartitionDiagnoseResponse setBody(DescribeTablePartitionDiagnoseResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTablePartitionDiagnoseResponseBody getBody() {
        return this.body;
    }

}
