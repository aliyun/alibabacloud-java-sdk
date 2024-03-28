// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class GetSpareIpResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSpareIpResponseBody body;

    public static GetSpareIpResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSpareIpResponse self = new GetSpareIpResponse();
        return TeaModel.build(map, self);
    }

    public GetSpareIpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSpareIpResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSpareIpResponse setBody(GetSpareIpResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSpareIpResponseBody getBody() {
        return this.body;
    }

}
