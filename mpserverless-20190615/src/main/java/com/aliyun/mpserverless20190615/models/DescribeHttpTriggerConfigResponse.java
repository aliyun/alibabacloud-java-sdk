// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeHttpTriggerConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeHttpTriggerConfigResponseBody body;

    public static DescribeHttpTriggerConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHttpTriggerConfigResponse self = new DescribeHttpTriggerConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHttpTriggerConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHttpTriggerConfigResponse setBody(DescribeHttpTriggerConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHttpTriggerConfigResponseBody getBody() {
        return this.body;
    }

}
