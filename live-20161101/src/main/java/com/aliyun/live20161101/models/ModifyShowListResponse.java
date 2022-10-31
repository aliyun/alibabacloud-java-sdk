// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyShowListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyShowListResponseBody body;

    public static ModifyShowListResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyShowListResponse self = new ModifyShowListResponse();
        return TeaModel.build(map, self);
    }

    public ModifyShowListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyShowListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyShowListResponse setBody(ModifyShowListResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyShowListResponseBody getBody() {
        return this.body;
    }

}
