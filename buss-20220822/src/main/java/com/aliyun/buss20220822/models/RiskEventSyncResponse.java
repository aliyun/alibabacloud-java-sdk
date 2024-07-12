// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.buss20220822.models;

import com.aliyun.tea.*;

public class RiskEventSyncResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RiskEventSyncResponseBody body;

    public static RiskEventSyncResponse build(java.util.Map<String, ?> map) throws Exception {
        RiskEventSyncResponse self = new RiskEventSyncResponse();
        return TeaModel.build(map, self);
    }

    public RiskEventSyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RiskEventSyncResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RiskEventSyncResponse setBody(RiskEventSyncResponseBody body) {
        this.body = body;
        return this;
    }
    public RiskEventSyncResponseBody getBody() {
        return this.body;
    }

}
