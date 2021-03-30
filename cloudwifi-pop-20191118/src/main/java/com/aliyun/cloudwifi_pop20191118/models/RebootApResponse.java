// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class RebootApResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RebootApResponseBody body;

    public static RebootApResponse build(java.util.Map<String, ?> map) throws Exception {
        RebootApResponse self = new RebootApResponse();
        return TeaModel.build(map, self);
    }

    public RebootApResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RebootApResponse setBody(RebootApResponseBody body) {
        this.body = body;
        return this;
    }
    public RebootApResponseBody getBody() {
        return this.body;
    }

}
