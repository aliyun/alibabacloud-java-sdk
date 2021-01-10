// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class ModifyWebHostingConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyWebHostingConfigResponseBody body;

    public static ModifyWebHostingConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebHostingConfigResponse self = new ModifyWebHostingConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyWebHostingConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyWebHostingConfigResponse setBody(ModifyWebHostingConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyWebHostingConfigResponseBody getBody() {
        return this.body;
    }

}
