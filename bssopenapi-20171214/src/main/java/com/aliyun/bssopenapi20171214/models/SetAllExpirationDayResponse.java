// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class SetAllExpirationDayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetAllExpirationDayResponseBody body;

    public static SetAllExpirationDayResponse build(java.util.Map<String, ?> map) throws Exception {
        SetAllExpirationDayResponse self = new SetAllExpirationDayResponse();
        return TeaModel.build(map, self);
    }

    public SetAllExpirationDayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetAllExpirationDayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetAllExpirationDayResponse setBody(SetAllExpirationDayResponseBody body) {
        this.body = body;
        return this;
    }
    public SetAllExpirationDayResponseBody getBody() {
        return this.body;
    }

}
