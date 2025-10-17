// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyMaterializedViewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyMaterializedViewResponseBody body;

    public static ModifyMaterializedViewResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyMaterializedViewResponse self = new ModifyMaterializedViewResponse();
        return TeaModel.build(map, self);
    }

    public ModifyMaterializedViewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyMaterializedViewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyMaterializedViewResponse setBody(ModifyMaterializedViewResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyMaterializedViewResponseBody getBody() {
        return this.body;
    }

}
