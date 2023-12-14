// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ModifyDataSourceLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDataSourceLogResponseBody body;

    public static ModifyDataSourceLogResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDataSourceLogResponse self = new ModifyDataSourceLogResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDataSourceLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDataSourceLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDataSourceLogResponse setBody(ModifyDataSourceLogResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDataSourceLogResponseBody getBody() {
        return this.body;
    }

}
