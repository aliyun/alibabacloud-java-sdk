// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class ModifyDataCenterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDataCenterResponseBody body;

    public static ModifyDataCenterResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDataCenterResponse self = new ModifyDataCenterResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDataCenterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDataCenterResponse setBody(ModifyDataCenterResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDataCenterResponseBody getBody() {
        return this.body;
    }

}
