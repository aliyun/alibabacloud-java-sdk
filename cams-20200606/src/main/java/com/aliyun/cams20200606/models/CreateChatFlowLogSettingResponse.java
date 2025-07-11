// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CreateChatFlowLogSettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateChatFlowLogSettingResponseBody body;

    public static CreateChatFlowLogSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateChatFlowLogSettingResponse self = new CreateChatFlowLogSettingResponse();
        return TeaModel.build(map, self);
    }

    public CreateChatFlowLogSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateChatFlowLogSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateChatFlowLogSettingResponse setBody(CreateChatFlowLogSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateChatFlowLogSettingResponseBody getBody() {
        return this.body;
    }

}
