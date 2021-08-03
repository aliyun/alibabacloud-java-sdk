// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteScaleStrategyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteScaleStrategyResponseBody body;

    public static DeleteScaleStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteScaleStrategyResponse self = new DeleteScaleStrategyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteScaleStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteScaleStrategyResponse setBody(DeleteScaleStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteScaleStrategyResponseBody getBody() {
        return this.body;
    }

}
