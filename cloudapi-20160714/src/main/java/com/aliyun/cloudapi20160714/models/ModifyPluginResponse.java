// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyPluginResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyPluginResponseBody body;

    public static ModifyPluginResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPluginResponse self = new ModifyPluginResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPluginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyPluginResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyPluginResponse setBody(ModifyPluginResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPluginResponseBody getBody() {
        return this.body;
    }

}
