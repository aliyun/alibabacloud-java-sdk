// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class ModifyInstanceNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyInstanceNameResponseBody body;

    public static ModifyInstanceNameResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceNameResponse self = new ModifyInstanceNameResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceNameResponse setBody(ModifyInstanceNameResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceNameResponseBody getBody() {
        return this.body;
    }

}
