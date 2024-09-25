// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class RemoveWhiteListSettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveWhiteListSettingResponseBody body;

    public static RemoveWhiteListSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveWhiteListSettingResponse self = new RemoveWhiteListSettingResponse();
        return TeaModel.build(map, self);
    }

    public RemoveWhiteListSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveWhiteListSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveWhiteListSettingResponse setBody(RemoveWhiteListSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveWhiteListSettingResponseBody getBody() {
        return this.body;
    }

}
