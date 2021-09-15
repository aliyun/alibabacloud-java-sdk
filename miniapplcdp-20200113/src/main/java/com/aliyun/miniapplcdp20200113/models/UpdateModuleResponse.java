// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class UpdateModuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateModuleResponseBody body;

    public static UpdateModuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateModuleResponse self = new UpdateModuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateModuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateModuleResponse setBody(UpdateModuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateModuleResponseBody getBody() {
        return this.body;
    }

}
