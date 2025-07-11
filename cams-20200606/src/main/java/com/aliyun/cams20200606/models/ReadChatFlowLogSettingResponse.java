// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ReadChatFlowLogSettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReadChatFlowLogSettingResponseBody body;

    public static ReadChatFlowLogSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        ReadChatFlowLogSettingResponse self = new ReadChatFlowLogSettingResponse();
        return TeaModel.build(map, self);
    }

    public ReadChatFlowLogSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReadChatFlowLogSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReadChatFlowLogSettingResponse setBody(ReadChatFlowLogSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public ReadChatFlowLogSettingResponseBody getBody() {
        return this.body;
    }

}
