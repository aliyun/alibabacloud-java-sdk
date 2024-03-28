// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class AddDingtalkOpenPlatformConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddDingtalkOpenPlatformConfigResponseBody body;

    public static AddDingtalkOpenPlatformConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDingtalkOpenPlatformConfigResponse self = new AddDingtalkOpenPlatformConfigResponse();
        return TeaModel.build(map, self);
    }

    public AddDingtalkOpenPlatformConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDingtalkOpenPlatformConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddDingtalkOpenPlatformConfigResponse setBody(AddDingtalkOpenPlatformConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDingtalkOpenPlatformConfigResponseBody getBody() {
        return this.body;
    }

}
