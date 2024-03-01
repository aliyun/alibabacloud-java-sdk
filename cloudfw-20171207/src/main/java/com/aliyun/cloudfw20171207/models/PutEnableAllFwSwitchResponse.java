// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class PutEnableAllFwSwitchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PutEnableAllFwSwitchResponseBody body;

    public static PutEnableAllFwSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        PutEnableAllFwSwitchResponse self = new PutEnableAllFwSwitchResponse();
        return TeaModel.build(map, self);
    }

    public PutEnableAllFwSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutEnableAllFwSwitchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutEnableAllFwSwitchResponse setBody(PutEnableAllFwSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public PutEnableAllFwSwitchResponseBody getBody() {
        return this.body;
    }

}
