// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CreateVerifySettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateVerifySettingResponseBody body;

    public static CreateVerifySettingResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVerifySettingResponse self = new CreateVerifySettingResponse();
        return TeaModel.build(map, self);
    }

    public CreateVerifySettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVerifySettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVerifySettingResponse setBody(CreateVerifySettingResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVerifySettingResponseBody getBody() {
        return this.body;
    }

}
