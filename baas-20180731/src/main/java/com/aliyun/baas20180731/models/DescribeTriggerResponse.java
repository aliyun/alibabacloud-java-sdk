// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeTriggerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTriggerResponseBody body;

    public static DescribeTriggerResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTriggerResponse self = new DescribeTriggerResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTriggerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTriggerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTriggerResponse setBody(DescribeTriggerResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTriggerResponseBody getBody() {
        return this.body;
    }

}
