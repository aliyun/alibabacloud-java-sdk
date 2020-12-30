// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CreateVerifySettingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateVerifySettingResponse setBody(CreateVerifySettingResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVerifySettingResponseBody getBody() {
        return this.body;
    }

}
