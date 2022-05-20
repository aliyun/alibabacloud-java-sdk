// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class TurnOnSecondSwitchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public TurnOnSecondSwitchResponseBody body;

    public static TurnOnSecondSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        TurnOnSecondSwitchResponse self = new TurnOnSecondSwitchResponse();
        return TeaModel.build(map, self);
    }

    public TurnOnSecondSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TurnOnSecondSwitchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TurnOnSecondSwitchResponse setBody(TurnOnSecondSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public TurnOnSecondSwitchResponseBody getBody() {
        return this.body;
    }

}
