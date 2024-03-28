// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DeleteAntOpenPlatformConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAntOpenPlatformConfigResponseBody body;

    public static DeleteAntOpenPlatformConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAntOpenPlatformConfigResponse self = new DeleteAntOpenPlatformConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAntOpenPlatformConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAntOpenPlatformConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAntOpenPlatformConfigResponse setBody(DeleteAntOpenPlatformConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAntOpenPlatformConfigResponseBody getBody() {
        return this.body;
    }

}
