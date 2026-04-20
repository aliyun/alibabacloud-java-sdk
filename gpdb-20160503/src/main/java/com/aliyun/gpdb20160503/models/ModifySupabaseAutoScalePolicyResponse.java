// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifySupabaseAutoScalePolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySupabaseAutoScalePolicyResponseBody body;

    public static ModifySupabaseAutoScalePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySupabaseAutoScalePolicyResponse self = new ModifySupabaseAutoScalePolicyResponse();
        return TeaModel.build(map, self);
    }

    public ModifySupabaseAutoScalePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySupabaseAutoScalePolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySupabaseAutoScalePolicyResponse setBody(ModifySupabaseAutoScalePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySupabaseAutoScalePolicyResponseBody getBody() {
        return this.body;
    }

}
