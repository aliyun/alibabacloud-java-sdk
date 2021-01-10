// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeMqttClientStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMqttClientStatusResponseBody body;

    public static DescribeMqttClientStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMqttClientStatusResponse self = new DescribeMqttClientStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMqttClientStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMqttClientStatusResponse setBody(DescribeMqttClientStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMqttClientStatusResponseBody getBody() {
        return this.body;
    }

}
