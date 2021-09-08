// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DeleteWhitelistSettingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteWhitelistSettingResponseBody body;

    public static DeleteWhitelistSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWhitelistSettingResponse self = new DeleteWhitelistSettingResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWhitelistSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWhitelistSettingResponse setBody(DeleteWhitelistSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWhitelistSettingResponseBody getBody() {
        return this.body;
    }

}
