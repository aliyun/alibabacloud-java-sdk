// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ModifyJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyJobResponseBody body;

    public static ModifyJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyJobResponse self = new ModifyJobResponse();
        return TeaModel.build(map, self);
    }

    public ModifyJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyJobResponse setBody(ModifyJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyJobResponseBody getBody() {
        return this.body;
    }

}
