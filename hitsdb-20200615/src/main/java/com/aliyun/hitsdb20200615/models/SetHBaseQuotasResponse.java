// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class SetHBaseQuotasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetHBaseQuotasResponseBody body;

    public static SetHBaseQuotasResponse build(java.util.Map<String, ?> map) throws Exception {
        SetHBaseQuotasResponse self = new SetHBaseQuotasResponse();
        return TeaModel.build(map, self);
    }

    public SetHBaseQuotasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetHBaseQuotasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetHBaseQuotasResponse setBody(SetHBaseQuotasResponseBody body) {
        this.body = body;
        return this;
    }
    public SetHBaseQuotasResponseBody getBody() {
        return this.body;
    }

}
