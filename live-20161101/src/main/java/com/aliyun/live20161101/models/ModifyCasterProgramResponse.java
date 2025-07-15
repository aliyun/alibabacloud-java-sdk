// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyCasterProgramResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ModifyCasterProgramResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyCasterProgramResponse setBody(ModifyCasterProgramResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCasterProgramResponseBody getBody() {
        return this.body;
    }

}
