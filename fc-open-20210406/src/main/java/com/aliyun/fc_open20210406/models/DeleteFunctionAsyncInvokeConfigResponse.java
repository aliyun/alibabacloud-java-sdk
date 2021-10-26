// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class DeleteFunctionAsyncInvokeConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static DeleteFunctionAsyncInvokeConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFunctionAsyncInvokeConfigResponse self = new DeleteFunctionAsyncInvokeConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFunctionAsyncInvokeConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
