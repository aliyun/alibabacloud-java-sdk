// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeMqttMessageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMqttMessageResponseBody body;

    public static DescribeMqttMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMqttMessageResponse self = new DescribeMqttMessageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMqttMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMqttMessageResponse setBody(DescribeMqttMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMqttMessageResponseBody getBody() {
        return this.body;
    }

}
