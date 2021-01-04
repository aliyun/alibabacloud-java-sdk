// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeSDKStatisticLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSDKStatisticLogResponseBody body;

    public static DescribeSDKStatisticLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSDKStatisticLogResponse self = new DescribeSDKStatisticLogResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSDKStatisticLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSDKStatisticLogResponse setBody(DescribeSDKStatisticLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSDKStatisticLogResponseBody getBody() {
        return this.body;
    }

}
