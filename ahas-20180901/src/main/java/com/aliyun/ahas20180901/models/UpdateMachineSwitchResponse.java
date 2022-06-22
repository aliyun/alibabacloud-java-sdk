// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class UpdateMachineSwitchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMachineSwitchResponseBody body;

    public static UpdateMachineSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMachineSwitchResponse self = new UpdateMachineSwitchResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMachineSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMachineSwitchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMachineSwitchResponse setBody(UpdateMachineSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMachineSwitchResponseBody getBody() {
        return this.body;
    }

}
