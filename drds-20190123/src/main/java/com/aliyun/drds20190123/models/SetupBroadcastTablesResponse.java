// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SetupBroadcastTablesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetupBroadcastTablesResponseBody body;

    public static SetupBroadcastTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        SetupBroadcastTablesResponse self = new SetupBroadcastTablesResponse();
        return TeaModel.build(map, self);
    }

    public SetupBroadcastTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetupBroadcastTablesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetupBroadcastTablesResponse setBody(SetupBroadcastTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public SetupBroadcastTablesResponseBody getBody() {
        return this.body;
    }

}
