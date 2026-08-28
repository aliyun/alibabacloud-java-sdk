// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class ModifyDasOpsConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDasOpsConfigResponseBody body;

    public static ModifyDasOpsConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDasOpsConfigResponse self = new ModifyDasOpsConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDasOpsConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDasOpsConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDasOpsConfigResponse setBody(ModifyDasOpsConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDasOpsConfigResponseBody getBody() {
        return this.body;
    }

}
