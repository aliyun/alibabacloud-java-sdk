// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeleteConfigCenterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteConfigCenterResponseBody body;

    public static DeleteConfigCenterResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteConfigCenterResponse self = new DeleteConfigCenterResponse();
        return TeaModel.build(map, self);
    }

    public DeleteConfigCenterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteConfigCenterResponse setBody(DeleteConfigCenterResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteConfigCenterResponseBody getBody() {
        return this.body;
    }

}
