// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class UnsubscribeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnsubscribeResponseBody body;

    public static UnsubscribeResponse build(java.util.Map<String, ?> map) throws Exception {
        UnsubscribeResponse self = new UnsubscribeResponse();
        return TeaModel.build(map, self);
    }

    public UnsubscribeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnsubscribeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnsubscribeResponse setBody(UnsubscribeResponseBody body) {
        this.body = body;
        return this;
    }
    public UnsubscribeResponseBody getBody() {
        return this.body;
    }

}
