// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyThreatIntelligenceSwitchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyThreatIntelligenceSwitchResponseBody body;

    public static ModifyThreatIntelligenceSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyThreatIntelligenceSwitchResponse self = new ModifyThreatIntelligenceSwitchResponse();
        return TeaModel.build(map, self);
    }

    public ModifyThreatIntelligenceSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyThreatIntelligenceSwitchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyThreatIntelligenceSwitchResponse setBody(ModifyThreatIntelligenceSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyThreatIntelligenceSwitchResponseBody getBody() {
        return this.body;
    }

}
