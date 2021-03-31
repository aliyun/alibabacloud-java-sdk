// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDemandResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDemandResponseBody body;

    public static ModifyDemandResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDemandResponse self = new ModifyDemandResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDemandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDemandResponse setBody(ModifyDemandResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDemandResponseBody getBody() {
        return this.body;
    }

}
