// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ModifyAndroidInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAndroidInstanceResponseBody body;

    public static ModifyAndroidInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAndroidInstanceResponse self = new ModifyAndroidInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAndroidInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAndroidInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAndroidInstanceResponse setBody(ModifyAndroidInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAndroidInstanceResponseBody getBody() {
        return this.body;
    }

}
