// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyDBClusterVipResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDBClusterVipResponseBody body;

    public static ModifyDBClusterVipResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterVipResponse self = new ModifyDBClusterVipResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterVipResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBClusterVipResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBClusterVipResponse setBody(ModifyDBClusterVipResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBClusterVipResponseBody getBody() {
        return this.body;
    }

}
