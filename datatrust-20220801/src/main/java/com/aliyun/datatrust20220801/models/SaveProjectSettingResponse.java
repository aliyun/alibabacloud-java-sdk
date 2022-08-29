// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class SaveProjectSettingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SaveProjectSettingResponseBody body;

    public static SaveProjectSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveProjectSettingResponse self = new SaveProjectSettingResponse();
        return TeaModel.build(map, self);
    }

    public SaveProjectSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveProjectSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveProjectSettingResponse setBody(SaveProjectSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveProjectSettingResponseBody getBody() {
        return this.body;
    }

}
