// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class ModifyIpCnameStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyIpCnameStatusResponseBody body;

    public static ModifyIpCnameStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyIpCnameStatusResponse self = new ModifyIpCnameStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyIpCnameStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyIpCnameStatusResponse setBody(ModifyIpCnameStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyIpCnameStatusResponseBody getBody() {
        return this.body;
    }

}
