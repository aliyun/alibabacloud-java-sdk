// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class ModifyInstanceTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyInstanceTypeResponseBody body;

    public static ModifyInstanceTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceTypeResponse self = new ModifyInstanceTypeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceTypeResponse setBody(ModifyInstanceTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceTypeResponseBody getBody() {
        return this.body;
    }

}
