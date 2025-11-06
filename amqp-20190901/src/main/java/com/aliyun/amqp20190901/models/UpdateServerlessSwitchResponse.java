// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class UpdateServerlessSwitchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateServerlessSwitchResponseBody body;

    public static UpdateServerlessSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateServerlessSwitchResponse self = new UpdateServerlessSwitchResponse();
        return TeaModel.build(map, self);
    }

    public UpdateServerlessSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateServerlessSwitchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateServerlessSwitchResponse setBody(UpdateServerlessSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateServerlessSwitchResponseBody getBody() {
        return this.body;
    }

}
