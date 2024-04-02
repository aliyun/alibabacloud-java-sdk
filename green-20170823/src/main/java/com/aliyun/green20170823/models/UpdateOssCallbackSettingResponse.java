// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class UpdateOssCallbackSettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateOssCallbackSettingResponseBody body;

    public static UpdateOssCallbackSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateOssCallbackSettingResponse self = new UpdateOssCallbackSettingResponse();
        return TeaModel.build(map, self);
    }

    public UpdateOssCallbackSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateOssCallbackSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateOssCallbackSettingResponse setBody(UpdateOssCallbackSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateOssCallbackSettingResponseBody getBody() {
        return this.body;
    }

}
