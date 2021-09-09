// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateAdvancedSettingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UpdateAdvancedSettingResponse setBody(UpdateAdvancedSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAdvancedSettingResponseBody getBody() {
        return this.body;
    }

}
