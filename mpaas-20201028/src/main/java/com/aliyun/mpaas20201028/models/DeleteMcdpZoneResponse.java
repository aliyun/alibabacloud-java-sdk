// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class DeleteMcdpZoneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMcdpZoneResponseBody body;

    public static DeleteMcdpZoneResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMcdpZoneResponse self = new DeleteMcdpZoneResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMcdpZoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMcdpZoneResponse setBody(DeleteMcdpZoneResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMcdpZoneResponseBody getBody() {
        return this.body;
    }

}
