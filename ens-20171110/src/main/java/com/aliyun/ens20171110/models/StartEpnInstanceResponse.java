// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class StartEpnInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartEpnInstanceResponseBody body;

    public static StartEpnInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        StartEpnInstanceResponse self = new StartEpnInstanceResponse();
        return TeaModel.build(map, self);
    }

    public StartEpnInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartEpnInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartEpnInstanceResponse setBody(StartEpnInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public StartEpnInstanceResponseBody getBody() {
        return this.body;
    }

}
