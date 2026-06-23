// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class UpdateInstanceServerlessSwitchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateInstanceServerlessSwitchResponseBody body;

    public static UpdateInstanceServerlessSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceServerlessSwitchResponse self = new UpdateInstanceServerlessSwitchResponse();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceServerlessSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateInstanceServerlessSwitchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateInstanceServerlessSwitchResponse setBody(UpdateInstanceServerlessSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateInstanceServerlessSwitchResponseBody getBody() {
        return this.body;
    }

}
