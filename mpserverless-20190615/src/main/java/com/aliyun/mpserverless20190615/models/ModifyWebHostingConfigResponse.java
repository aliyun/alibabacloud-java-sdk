// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class ModifyWebHostingConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ModifyWebHostingConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyWebHostingConfigResponse setBody(ModifyWebHostingConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyWebHostingConfigResponseBody getBody() {
        return this.body;
    }

}
