// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class UpdateVerifySettingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateVerifySettingResponseBody body;

    public static UpdateVerifySettingResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateVerifySettingResponse self = new UpdateVerifySettingResponse();
        return TeaModel.build(map, self);
    }

    public UpdateVerifySettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateVerifySettingResponse setBody(UpdateVerifySettingResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateVerifySettingResponseBody getBody() {
        return this.body;
    }

}
