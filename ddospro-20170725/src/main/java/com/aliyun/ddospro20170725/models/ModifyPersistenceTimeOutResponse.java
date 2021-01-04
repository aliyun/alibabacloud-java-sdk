// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class ModifyPersistenceTimeOutResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyPersistenceTimeOutResponseBody body;

    public static ModifyPersistenceTimeOutResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPersistenceTimeOutResponse self = new ModifyPersistenceTimeOutResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPersistenceTimeOutResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyPersistenceTimeOutResponse setBody(ModifyPersistenceTimeOutResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPersistenceTimeOutResponseBody getBody() {
        return this.body;
    }

}
