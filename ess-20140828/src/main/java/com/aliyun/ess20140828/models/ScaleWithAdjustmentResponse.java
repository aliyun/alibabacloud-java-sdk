// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class ScaleWithAdjustmentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ScaleWithAdjustmentResponseBody body;

    public static ScaleWithAdjustmentResponse build(java.util.Map<String, ?> map) throws Exception {
        ScaleWithAdjustmentResponse self = new ScaleWithAdjustmentResponse();
        return TeaModel.build(map, self);
    }

    public ScaleWithAdjustmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ScaleWithAdjustmentResponse setBody(ScaleWithAdjustmentResponseBody body) {
        this.body = body;
        return this;
    }
    public ScaleWithAdjustmentResponseBody getBody() {
        return this.body;
    }

}
