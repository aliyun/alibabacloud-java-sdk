// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20180501.models;

import com.aliyun.tea.*;

public class SendMessageToGlobeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendMessageToGlobeResponseBody body;

    public static SendMessageToGlobeResponse build(java.util.Map<String, ?> map) throws Exception {
        SendMessageToGlobeResponse self = new SendMessageToGlobeResponse();
        return TeaModel.build(map, self);
    }

    public SendMessageToGlobeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendMessageToGlobeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendMessageToGlobeResponse setBody(SendMessageToGlobeResponseBody body) {
        this.body = body;
        return this;
    }
    public SendMessageToGlobeResponseBody getBody() {
        return this.body;
    }

}
