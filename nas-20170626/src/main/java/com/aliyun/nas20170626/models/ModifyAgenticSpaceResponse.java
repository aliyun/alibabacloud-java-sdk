// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyAgenticSpaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAgenticSpaceResponseBody body;

    public static ModifyAgenticSpaceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAgenticSpaceResponse self = new ModifyAgenticSpaceResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAgenticSpaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAgenticSpaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAgenticSpaceResponse setBody(ModifyAgenticSpaceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAgenticSpaceResponseBody getBody() {
        return this.body;
    }

}
