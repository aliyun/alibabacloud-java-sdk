// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifySupabaseProjectResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySupabaseProjectResourceResponseBody body;

    public static ModifySupabaseProjectResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySupabaseProjectResourceResponse self = new ModifySupabaseProjectResourceResponse();
        return TeaModel.build(map, self);
    }

    public ModifySupabaseProjectResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySupabaseProjectResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySupabaseProjectResourceResponse setBody(ModifySupabaseProjectResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySupabaseProjectResourceResponseBody getBody() {
        return this.body;
    }

}
