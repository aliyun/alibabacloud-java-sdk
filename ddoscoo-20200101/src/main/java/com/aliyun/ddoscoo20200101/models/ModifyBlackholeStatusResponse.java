// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyBlackholeStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyBlackholeStatusResponseBody body;

    public static ModifyBlackholeStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyBlackholeStatusResponse self = new ModifyBlackholeStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyBlackholeStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyBlackholeStatusResponse setBody(ModifyBlackholeStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyBlackholeStatusResponseBody getBody() {
        return this.body;
    }

}
