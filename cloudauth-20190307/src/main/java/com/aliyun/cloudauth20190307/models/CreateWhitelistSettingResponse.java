// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CreateWhitelistSettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateWhitelistSettingResponseBody body;

    public static CreateWhitelistSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWhitelistSettingResponse self = new CreateWhitelistSettingResponse();
        return TeaModel.build(map, self);
    }

    public CreateWhitelistSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWhitelistSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWhitelistSettingResponse setBody(CreateWhitelistSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWhitelistSettingResponseBody getBody() {
        return this.body;
    }

}
