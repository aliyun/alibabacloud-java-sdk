// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class GetNetworkBlacklistResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetNetworkBlacklistResponseBody body;

    public static GetNetworkBlacklistResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNetworkBlacklistResponse self = new GetNetworkBlacklistResponse();
        return TeaModel.build(map, self);
    }

    public GetNetworkBlacklistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNetworkBlacklistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNetworkBlacklistResponse setBody(GetNetworkBlacklistResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNetworkBlacklistResponseBody getBody() {
        return this.body;
    }

}
