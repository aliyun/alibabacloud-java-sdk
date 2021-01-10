// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetCasterSyncGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetCasterSyncGroupResponseBody body;

    public static SetCasterSyncGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        SetCasterSyncGroupResponse self = new SetCasterSyncGroupResponse();
        return TeaModel.build(map, self);
    }

    public SetCasterSyncGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetCasterSyncGroupResponse setBody(SetCasterSyncGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public SetCasterSyncGroupResponseBody getBody() {
        return this.body;
    }

}
