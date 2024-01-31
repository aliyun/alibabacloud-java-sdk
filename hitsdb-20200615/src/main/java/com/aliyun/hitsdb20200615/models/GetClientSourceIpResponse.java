// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class GetClientSourceIpResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetClientSourceIpResponseBody body;

    public static GetClientSourceIpResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClientSourceIpResponse self = new GetClientSourceIpResponse();
        return TeaModel.build(map, self);
    }

    public GetClientSourceIpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClientSourceIpResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetClientSourceIpResponse setBody(GetClientSourceIpResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClientSourceIpResponseBody getBody() {
        return this.body;
    }

}
