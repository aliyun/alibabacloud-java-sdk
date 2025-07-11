// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class UpdateChatFlowLogSettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateChatFlowLogSettingResponseBody body;

    public static UpdateChatFlowLogSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateChatFlowLogSettingResponse self = new UpdateChatFlowLogSettingResponse();
        return TeaModel.build(map, self);
    }

    public UpdateChatFlowLogSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateChatFlowLogSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateChatFlowLogSettingResponse setBody(UpdateChatFlowLogSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateChatFlowLogSettingResponseBody getBody() {
        return this.body;
    }

}
