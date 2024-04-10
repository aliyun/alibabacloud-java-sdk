// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class SubscribeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubscribeResponseBody body;

    public static SubscribeResponse build(java.util.Map<String, ?> map) throws Exception {
        SubscribeResponse self = new SubscribeResponse();
        return TeaModel.build(map, self);
    }

    public SubscribeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubscribeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubscribeResponse setBody(SubscribeResponseBody body) {
        this.body = body;
        return this;
    }
    public SubscribeResponseBody getBody() {
        return this.body;
    }

}
