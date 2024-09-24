// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class ModifyApplicationSpecResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyApplicationSpecResponseBody body;

    public static ModifyApplicationSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyApplicationSpecResponse self = new ModifyApplicationSpecResponse();
        return TeaModel.build(map, self);
    }

    public ModifyApplicationSpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyApplicationSpecResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyApplicationSpecResponse setBody(ModifyApplicationSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyApplicationSpecResponseBody getBody() {
        return this.body;
    }

}
