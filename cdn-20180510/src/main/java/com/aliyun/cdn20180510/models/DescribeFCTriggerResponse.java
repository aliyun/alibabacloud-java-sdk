// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeFCTriggerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFCTriggerResponseBody body;

    public static DescribeFCTriggerResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFCTriggerResponse self = new DescribeFCTriggerResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFCTriggerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFCTriggerResponse setBody(DescribeFCTriggerResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFCTriggerResponseBody getBody() {
        return this.body;
    }

}
