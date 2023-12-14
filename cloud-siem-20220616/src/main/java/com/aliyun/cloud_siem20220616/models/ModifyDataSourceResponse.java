// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ModifyDataSourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
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
