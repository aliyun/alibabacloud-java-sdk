// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class StopEpnInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopEpnInstanceResponseBody body;

    public static StopEpnInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        StopEpnInstanceResponse self = new StopEpnInstanceResponse();
        return TeaModel.build(map, self);
    }

    public StopEpnInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopEpnInstanceResponse setBody(StopEpnInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public StopEpnInstanceResponseBody getBody() {
        return this.body;
    }

}
