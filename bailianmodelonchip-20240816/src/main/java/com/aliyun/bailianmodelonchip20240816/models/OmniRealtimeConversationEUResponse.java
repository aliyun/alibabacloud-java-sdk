// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class OmniRealtimeConversationEUResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OmniRealtimeConversationEUResponseBody body;

    public static OmniRealtimeConversationEUResponse build(java.util.Map<String, ?> map) throws Exception {
        OmniRealtimeConversationEUResponse self = new OmniRealtimeConversationEUResponse();
        return TeaModel.build(map, self);
    }

    public OmniRealtimeConversationEUResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OmniRealtimeConversationEUResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OmniRealtimeConversationEUResponse setBody(OmniRealtimeConversationEUResponseBody body) {
        this.body = body;
        return this;
    }
    public OmniRealtimeConversationEUResponseBody getBody() {
        return this.body;
    }

}
