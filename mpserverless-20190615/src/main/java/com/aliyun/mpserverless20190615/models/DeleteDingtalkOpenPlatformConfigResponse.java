// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DeleteDingtalkOpenPlatformConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDingtalkOpenPlatformConfigResponseBody body;

    public static DeleteDingtalkOpenPlatformConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDingtalkOpenPlatformConfigResponse self = new DeleteDingtalkOpenPlatformConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDingtalkOpenPlatformConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDingtalkOpenPlatformConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDingtalkOpenPlatformConfigResponse setBody(DeleteDingtalkOpenPlatformConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDingtalkOpenPlatformConfigResponseBody getBody() {
        return this.body;
    }

}
