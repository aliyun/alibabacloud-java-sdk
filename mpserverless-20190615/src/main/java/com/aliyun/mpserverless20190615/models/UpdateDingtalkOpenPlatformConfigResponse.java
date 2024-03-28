// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class UpdateDingtalkOpenPlatformConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDingtalkOpenPlatformConfigResponseBody body;

    public static UpdateDingtalkOpenPlatformConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDingtalkOpenPlatformConfigResponse self = new UpdateDingtalkOpenPlatformConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDingtalkOpenPlatformConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDingtalkOpenPlatformConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDingtalkOpenPlatformConfigResponse setBody(UpdateDingtalkOpenPlatformConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDingtalkOpenPlatformConfigResponseBody getBody() {
        return this.body;
    }

}
