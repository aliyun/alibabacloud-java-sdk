// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DecommissionHostComponentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DecommissionHostComponentResponseBody body;

    public static DecommissionHostComponentResponse build(java.util.Map<String, ?> map) throws Exception {
        DecommissionHostComponentResponse self = new DecommissionHostComponentResponse();
        return TeaModel.build(map, self);
    }

    public DecommissionHostComponentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DecommissionHostComponentResponse setBody(DecommissionHostComponentResponseBody body) {
        this.body = body;
        return this;
    }
    public DecommissionHostComponentResponseBody getBody() {
        return this.body;
    }

}
