// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class SetPurchasedApiGroupStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetPurchasedApiGroupStatusResponseBody body;

    public static SetPurchasedApiGroupStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        SetPurchasedApiGroupStatusResponse self = new SetPurchasedApiGroupStatusResponse();
        return TeaModel.build(map, self);
    }

    public SetPurchasedApiGroupStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetPurchasedApiGroupStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetPurchasedApiGroupStatusResponse setBody(SetPurchasedApiGroupStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public SetPurchasedApiGroupStatusResponseBody getBody() {
        return this.body;
    }

}
