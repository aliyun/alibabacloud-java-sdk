// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ModifyResourcePoolSchedulerTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyResourcePoolSchedulerTypeResponseBody body;

    public static ModifyResourcePoolSchedulerTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyResourcePoolSchedulerTypeResponse self = new ModifyResourcePoolSchedulerTypeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyResourcePoolSchedulerTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyResourcePoolSchedulerTypeResponse setBody(ModifyResourcePoolSchedulerTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyResourcePoolSchedulerTypeResponseBody getBody() {
        return this.body;
    }

}
