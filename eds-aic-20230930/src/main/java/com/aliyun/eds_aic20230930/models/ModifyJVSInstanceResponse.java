// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ModifyJVSInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyJVSInstanceResponseBody body;

    public static ModifyJVSInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyJVSInstanceResponse self = new ModifyJVSInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ModifyJVSInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyJVSInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyJVSInstanceResponse setBody(ModifyJVSInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyJVSInstanceResponseBody getBody() {
        return this.body;
    }

}
