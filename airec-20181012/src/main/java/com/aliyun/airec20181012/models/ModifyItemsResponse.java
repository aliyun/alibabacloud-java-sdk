// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class ModifyItemsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyItemsResponseBody body;

    public static ModifyItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyItemsResponse self = new ModifyItemsResponse();
        return TeaModel.build(map, self);
    }

    public ModifyItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyItemsResponse setBody(ModifyItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyItemsResponseBody getBody() {
        return this.body;
    }

}
