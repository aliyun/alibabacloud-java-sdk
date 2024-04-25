// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class ModifySqlLogConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySqlLogConfigResponseBody body;

    public static ModifySqlLogConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySqlLogConfigResponse self = new ModifySqlLogConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifySqlLogConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySqlLogConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySqlLogConfigResponse setBody(ModifySqlLogConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySqlLogConfigResponseBody getBody() {
        return this.body;
    }

}
