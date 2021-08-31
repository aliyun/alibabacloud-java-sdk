// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateHostGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateHostGroupResponseBody body;

    public static UpdateHostGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHostGroupResponse self = new UpdateHostGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHostGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHostGroupResponse setBody(UpdateHostGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHostGroupResponseBody getBody() {
        return this.body;
    }

}
