// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class InsertWhiteListSettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InsertWhiteListSettingResponseBody body;

    public static InsertWhiteListSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        InsertWhiteListSettingResponse self = new InsertWhiteListSettingResponse();
        return TeaModel.build(map, self);
    }

    public InsertWhiteListSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InsertWhiteListSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InsertWhiteListSettingResponse setBody(InsertWhiteListSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public InsertWhiteListSettingResponseBody getBody() {
        return this.body;
    }

}
