// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeFCTriggerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeFCTriggerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFCTriggerResponse setBody(DescribeFCTriggerResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFCTriggerResponseBody getBody() {
        return this.body;
    }

}
