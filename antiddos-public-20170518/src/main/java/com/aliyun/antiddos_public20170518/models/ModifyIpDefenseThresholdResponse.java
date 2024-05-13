// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class ModifyIpDefenseThresholdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyIpDefenseThresholdResponseBody body;

    public static ModifyIpDefenseThresholdResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyIpDefenseThresholdResponse self = new ModifyIpDefenseThresholdResponse();
        return TeaModel.build(map, self);
    }

    public ModifyIpDefenseThresholdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyIpDefenseThresholdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyIpDefenseThresholdResponse setBody(ModifyIpDefenseThresholdResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyIpDefenseThresholdResponseBody getBody() {
        return this.body;
    }

}
