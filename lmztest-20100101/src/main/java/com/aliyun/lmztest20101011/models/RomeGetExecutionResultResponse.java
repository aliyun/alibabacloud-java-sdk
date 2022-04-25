// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class RomeGetExecutionResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static RomeGetExecutionResultResponse build(java.util.Map<String, ?> map) throws Exception {
        RomeGetExecutionResultResponse self = new RomeGetExecutionResultResponse();
        return TeaModel.build(map, self);
    }

    public RomeGetExecutionResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
