// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DeleteWhitelistSettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteWhitelistSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWhitelistSettingResponse setBody(DeleteWhitelistSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWhitelistSettingResponseBody getBody() {
        return this.body;
    }

}
