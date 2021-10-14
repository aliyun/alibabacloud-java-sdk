// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class DelApThirdAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DelApThirdAppResponseBody body;

    public static DelApThirdAppResponse build(java.util.Map<String, ?> map) throws Exception {
        DelApThirdAppResponse self = new DelApThirdAppResponse();
        return TeaModel.build(map, self);
    }

    public DelApThirdAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DelApThirdAppResponse setBody(DelApThirdAppResponseBody body) {
        this.body = body;
        return this;
    }
    public DelApThirdAppResponseBody getBody() {
        return this.body;
    }

}
