// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ModifyDisplayConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDisplayConfigResponseBody body;

    public static ModifyDisplayConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDisplayConfigResponse self = new ModifyDisplayConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDisplayConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDisplayConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDisplayConfigResponse setBody(ModifyDisplayConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDisplayConfigResponseBody getBody() {
        return this.body;
    }

}
