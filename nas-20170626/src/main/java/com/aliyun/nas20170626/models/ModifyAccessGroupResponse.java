// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyAccessGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyAccessGroupResponseBody body;

    public static ModifyAccessGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccessGroupResponse self = new ModifyAccessGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAccessGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAccessGroupResponse setBody(ModifyAccessGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAccessGroupResponseBody getBody() {
        return this.body;
    }

}
