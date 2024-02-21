// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateAdvancedSettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAdvancedSettingResponseBody body;

    public static UpdateAdvancedSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAdvancedSettingResponse self = new UpdateAdvancedSettingResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAdvancedSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAdvancedSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAdvancedSettingResponse setBody(UpdateAdvancedSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAdvancedSettingResponseBody getBody() {
        return this.body;
    }

}
