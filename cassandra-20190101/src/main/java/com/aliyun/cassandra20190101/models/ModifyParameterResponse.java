// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class ModifyParameterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyParameterResponseBody body;

    public static ModifyParameterResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyParameterResponse self = new ModifyParameterResponse();
        return TeaModel.build(map, self);
    }

    public ModifyParameterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyParameterResponse setBody(ModifyParameterResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyParameterResponseBody getBody() {
        return this.body;
    }

}
