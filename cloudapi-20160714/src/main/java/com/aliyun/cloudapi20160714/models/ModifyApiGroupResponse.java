// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyApiGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyApiGroupResponseBody body;

    public static ModifyApiGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyApiGroupResponse self = new ModifyApiGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifyApiGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyApiGroupResponse setBody(ModifyApiGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyApiGroupResponseBody getBody() {
        return this.body;
    }

}
