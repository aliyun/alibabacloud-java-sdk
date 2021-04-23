// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyStudioLayoutResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyStudioLayoutResponseBody body;

    public static ModifyStudioLayoutResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyStudioLayoutResponse self = new ModifyStudioLayoutResponse();
        return TeaModel.build(map, self);
    }

    public ModifyStudioLayoutResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyStudioLayoutResponse setBody(ModifyStudioLayoutResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyStudioLayoutResponseBody getBody() {
        return this.body;
    }

}
