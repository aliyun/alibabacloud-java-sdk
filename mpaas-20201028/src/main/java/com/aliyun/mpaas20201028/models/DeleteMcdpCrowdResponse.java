// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class DeleteMcdpCrowdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMcdpCrowdResponseBody body;

    public static DeleteMcdpCrowdResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMcdpCrowdResponse self = new DeleteMcdpCrowdResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMcdpCrowdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMcdpCrowdResponse setBody(DeleteMcdpCrowdResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMcdpCrowdResponseBody getBody() {
        return this.body;
    }

}
