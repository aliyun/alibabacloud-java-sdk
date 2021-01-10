// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyCasterProgramResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyCasterProgramResponseBody body;

    public static ModifyCasterProgramResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCasterProgramResponse self = new ModifyCasterProgramResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCasterProgramResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCasterProgramResponse setBody(ModifyCasterProgramResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCasterProgramResponseBody getBody() {
        return this.body;
    }

}
