// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateWorkOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateWorkOrderResponseBody body;

    public static UpdateWorkOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkOrderResponse self = new UpdateWorkOrderResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWorkOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWorkOrderResponse setBody(UpdateWorkOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWorkOrderResponseBody getBody() {
        return this.body;
    }

}
