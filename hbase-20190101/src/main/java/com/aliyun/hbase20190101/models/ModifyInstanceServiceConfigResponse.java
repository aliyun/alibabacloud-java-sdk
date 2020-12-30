// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ModifyInstanceServiceConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyInstanceServiceConfigResponseBody body;

    public static ModifyInstanceServiceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceServiceConfigResponse self = new ModifyInstanceServiceConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceServiceConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceServiceConfigResponse setBody(ModifyInstanceServiceConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceServiceConfigResponseBody getBody() {
        return this.body;
    }

}
