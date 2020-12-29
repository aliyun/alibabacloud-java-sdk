// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class ModifyDefenseThresholdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDefenseThresholdResponseBody body;

    public static ModifyDefenseThresholdResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDefenseThresholdResponse self = new ModifyDefenseThresholdResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDefenseThresholdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDefenseThresholdResponse setBody(ModifyDefenseThresholdResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDefenseThresholdResponseBody getBody() {
        return this.body;
    }

}
