// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class SaveAntOpenPlatformConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveAntOpenPlatformConfigResponseBody body;

    public static SaveAntOpenPlatformConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveAntOpenPlatformConfigResponse self = new SaveAntOpenPlatformConfigResponse();
        return TeaModel.build(map, self);
    }

    public SaveAntOpenPlatformConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveAntOpenPlatformConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveAntOpenPlatformConfigResponse setBody(SaveAntOpenPlatformConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveAntOpenPlatformConfigResponseBody getBody() {
        return this.body;
    }

}
