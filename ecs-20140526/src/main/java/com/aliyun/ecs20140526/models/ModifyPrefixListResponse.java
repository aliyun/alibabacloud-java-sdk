// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyPrefixListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyPrefixListResponseBody body;

    public static ModifyPrefixListResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPrefixListResponse self = new ModifyPrefixListResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPrefixListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyPrefixListResponse setBody(ModifyPrefixListResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPrefixListResponseBody getBody() {
        return this.body;
    }

}
