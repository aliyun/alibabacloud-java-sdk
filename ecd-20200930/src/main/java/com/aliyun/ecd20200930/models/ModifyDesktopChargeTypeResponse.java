// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyDesktopChargeTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDesktopChargeTypeResponseBody body;

    public static ModifyDesktopChargeTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDesktopChargeTypeResponse self = new ModifyDesktopChargeTypeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDesktopChargeTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDesktopChargeTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDesktopChargeTypeResponse setBody(ModifyDesktopChargeTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDesktopChargeTypeResponseBody getBody() {
        return this.body;
    }

}
