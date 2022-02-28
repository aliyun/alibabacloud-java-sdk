// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeRecoveryPointsForRPResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRecoveryPointsForRPResponseBody body;

    public static DescribeRecoveryPointsForRPResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecoveryPointsForRPResponse self = new DescribeRecoveryPointsForRPResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRecoveryPointsForRPResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRecoveryPointsForRPResponse setBody(DescribeRecoveryPointsForRPResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRecoveryPointsForRPResponseBody getBody() {
        return this.body;
    }

}
