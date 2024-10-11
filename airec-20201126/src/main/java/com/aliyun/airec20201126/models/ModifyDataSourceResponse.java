// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ModifyDataSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDataSourceResponseBody body;

    public static ModifyDataSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDataSourceResponse self = new ModifyDataSourceResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDataSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDataSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDataSourceResponse setBody(ModifyDataSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDataSourceResponseBody getBody() {
        return this.body;
    }

}
