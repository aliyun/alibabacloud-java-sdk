// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class ModifyLogConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyLogConfigResponseBody body;

    public static ModifyLogConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyLogConfigResponse self = new ModifyLogConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyLogConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyLogConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyLogConfigResponse setBody(ModifyLogConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyLogConfigResponseBody getBody() {
        return this.body;
    }

}
