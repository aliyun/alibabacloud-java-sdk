// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyAccessPointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAccessPointResponseBody body;

    public static ModifyAccessPointResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccessPointResponse self = new ModifyAccessPointResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAccessPointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAccessPointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAccessPointResponse setBody(ModifyAccessPointResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAccessPointResponseBody getBody() {
        return this.body;
    }

}
