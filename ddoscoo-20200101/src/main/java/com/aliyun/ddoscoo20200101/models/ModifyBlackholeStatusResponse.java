// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyBlackholeStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyBlackholeStatusResponseBody body;

    public static ModifyBlackholeStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyBlackholeStatusResponse self = new ModifyBlackholeStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyBlackholeStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyBlackholeStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyBlackholeStatusResponse setBody(ModifyBlackholeStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyBlackholeStatusResponseBody getBody() {
        return this.body;
    }

}
