// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDiskChargeTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDiskChargeTypeResponseBody body;

    public static ModifyDiskChargeTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDiskChargeTypeResponse self = new ModifyDiskChargeTypeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDiskChargeTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDiskChargeTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDiskChargeTypeResponse setBody(ModifyDiskChargeTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDiskChargeTypeResponseBody getBody() {
        return this.body;
    }

}
