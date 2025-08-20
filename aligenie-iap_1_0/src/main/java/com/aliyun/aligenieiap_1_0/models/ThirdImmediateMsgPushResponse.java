// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class ThirdImmediateMsgPushResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ThirdImmediateMsgPushResponseBody body;

    public static ThirdImmediateMsgPushResponse build(java.util.Map<String, ?> map) throws Exception {
        ThirdImmediateMsgPushResponse self = new ThirdImmediateMsgPushResponse();
        return TeaModel.build(map, self);
    }

    public ThirdImmediateMsgPushResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ThirdImmediateMsgPushResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ThirdImmediateMsgPushResponse setBody(ThirdImmediateMsgPushResponseBody body) {
        this.body = body;
        return this;
    }
    public ThirdImmediateMsgPushResponseBody getBody() {
        return this.body;
    }

}
