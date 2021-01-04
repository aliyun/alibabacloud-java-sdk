// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class UpdateGroupStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateGroupStatusResponseBody body;

    public static UpdateGroupStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGroupStatusResponse self = new UpdateGroupStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGroupStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGroupStatusResponse setBody(UpdateGroupStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGroupStatusResponseBody getBody() {
        return this.body;
    }

}
