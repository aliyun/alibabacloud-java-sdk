// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteHaVipResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteHaVipResponseBody body;

    public static DeleteHaVipResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHaVipResponse self = new DeleteHaVipResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHaVipResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHaVipResponse setBody(DeleteHaVipResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHaVipResponseBody getBody() {
        return this.body;
    }

}
