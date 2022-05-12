// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateVSwitchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateVSwitchResponseBody body;

    public static CreateVSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVSwitchResponse self = new CreateVSwitchResponse();
        return TeaModel.build(map, self);
    }

    public CreateVSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVSwitchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVSwitchResponse setBody(CreateVSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVSwitchResponseBody getBody() {
        return this.body;
    }

}
