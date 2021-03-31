// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteDemandResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDemandResponseBody body;

    public static DeleteDemandResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDemandResponse self = new DeleteDemandResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDemandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDemandResponse setBody(DeleteDemandResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDemandResponseBody getBody() {
        return this.body;
    }

}
