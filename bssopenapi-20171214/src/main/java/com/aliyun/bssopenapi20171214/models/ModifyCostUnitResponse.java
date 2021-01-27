// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class ModifyCostUnitResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyCostUnitResponseBody body;

    public static ModifyCostUnitResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCostUnitResponse self = new ModifyCostUnitResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCostUnitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCostUnitResponse setBody(ModifyCostUnitResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCostUnitResponseBody getBody() {
        return this.body;
    }

}
