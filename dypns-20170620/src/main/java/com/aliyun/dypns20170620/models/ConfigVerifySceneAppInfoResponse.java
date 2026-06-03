// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class ConfigVerifySceneAppInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfigVerifySceneAppInfoResponseBody body;

    public static ConfigVerifySceneAppInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigVerifySceneAppInfoResponse self = new ConfigVerifySceneAppInfoResponse();
        return TeaModel.build(map, self);
    }

    public ConfigVerifySceneAppInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigVerifySceneAppInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigVerifySceneAppInfoResponse setBody(ConfigVerifySceneAppInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigVerifySceneAppInfoResponseBody getBody() {
        return this.body;
    }

}
