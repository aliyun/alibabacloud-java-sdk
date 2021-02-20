// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class StopInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopInstanceResponseBody body;

    public static StopInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        StopInstanceResponse self = new StopInstanceResponse();
        return TeaModel.build(map, self);
    }

    public StopInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopInstanceResponse setBody(StopInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public StopInstanceResponseBody getBody() {
        return this.body;
    }

}
