// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteServiceAutoScalerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteServiceAutoScalerResponseBody body;

    public static DeleteServiceAutoScalerResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceAutoScalerResponse self = new DeleteServiceAutoScalerResponse();
        return TeaModel.build(map, self);
    }

    public DeleteServiceAutoScalerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteServiceAutoScalerResponse setBody(DeleteServiceAutoScalerResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteServiceAutoScalerResponseBody getBody() {
        return this.body;
    }

}
