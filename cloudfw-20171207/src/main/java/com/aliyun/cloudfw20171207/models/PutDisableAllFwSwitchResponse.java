// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class PutDisableAllFwSwitchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PutDisableAllFwSwitchResponseBody body;

    public static PutDisableAllFwSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        PutDisableAllFwSwitchResponse self = new PutDisableAllFwSwitchResponse();
        return TeaModel.build(map, self);
    }

    public PutDisableAllFwSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutDisableAllFwSwitchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutDisableAllFwSwitchResponse setBody(PutDisableAllFwSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public PutDisableAllFwSwitchResponseBody getBody() {
        return this.body;
    }

}
