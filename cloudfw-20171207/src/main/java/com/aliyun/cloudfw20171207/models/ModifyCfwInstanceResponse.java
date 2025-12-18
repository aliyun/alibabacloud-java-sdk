// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyCfwInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyCfwInstanceResponseBody body;

    public static ModifyCfwInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCfwInstanceResponse self = new ModifyCfwInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCfwInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCfwInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyCfwInstanceResponse setBody(ModifyCfwInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCfwInstanceResponseBody getBody() {
        return this.body;
    }

}
