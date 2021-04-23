// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteMultiRateConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMultiRateConfigResponseBody body;

    public static DeleteMultiRateConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMultiRateConfigResponse self = new DeleteMultiRateConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMultiRateConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMultiRateConfigResponse setBody(DeleteMultiRateConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMultiRateConfigResponseBody getBody() {
        return this.body;
    }

}
