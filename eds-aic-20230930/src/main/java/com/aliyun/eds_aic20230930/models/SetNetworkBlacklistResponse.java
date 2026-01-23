// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class SetNetworkBlacklistResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetNetworkBlacklistResponseBody body;

    public static SetNetworkBlacklistResponse build(java.util.Map<String, ?> map) throws Exception {
        SetNetworkBlacklistResponse self = new SetNetworkBlacklistResponse();
        return TeaModel.build(map, self);
    }

    public SetNetworkBlacklistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetNetworkBlacklistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetNetworkBlacklistResponse setBody(SetNetworkBlacklistResponseBody body) {
        this.body = body;
        return this;
    }
    public SetNetworkBlacklistResponseBody getBody() {
        return this.body;
    }

}
