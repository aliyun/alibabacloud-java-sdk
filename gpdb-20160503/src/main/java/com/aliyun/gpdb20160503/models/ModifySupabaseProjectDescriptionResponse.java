// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifySupabaseProjectDescriptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySupabaseProjectDescriptionResponseBody body;

    public static ModifySupabaseProjectDescriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySupabaseProjectDescriptionResponse self = new ModifySupabaseProjectDescriptionResponse();
        return TeaModel.build(map, self);
    }

    public ModifySupabaseProjectDescriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySupabaseProjectDescriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySupabaseProjectDescriptionResponse setBody(ModifySupabaseProjectDescriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySupabaseProjectDescriptionResponseBody getBody() {
        return this.body;
    }

}
