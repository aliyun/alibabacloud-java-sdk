// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class ModifyDefenseThresholdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ModifyDefenseThresholdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDefenseThresholdResponse setBody(ModifyDefenseThresholdResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDefenseThresholdResponseBody getBody() {
        return this.body;
    }

}
