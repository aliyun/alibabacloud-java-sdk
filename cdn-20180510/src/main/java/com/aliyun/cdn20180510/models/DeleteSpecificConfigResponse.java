// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DeleteSpecificConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSpecificConfigResponseBody body;

    public static DeleteSpecificConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSpecificConfigResponse self = new DeleteSpecificConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSpecificConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSpecificConfigResponse setBody(DeleteSpecificConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSpecificConfigResponseBody getBody() {
        return this.body;
    }

}
