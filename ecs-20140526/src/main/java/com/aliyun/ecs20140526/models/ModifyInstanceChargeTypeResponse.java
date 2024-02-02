// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceChargeTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyInstanceChargeTypeResponseBody body;

    public static ModifyInstanceChargeTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceChargeTypeResponse self = new ModifyInstanceChargeTypeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceChargeTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceChargeTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyInstanceChargeTypeResponse setBody(ModifyInstanceChargeTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceChargeTypeResponseBody getBody() {
        return this.body;
    }

}
