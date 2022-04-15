// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20220210.models;

import com.aliyun.tea.*;

public class GetMqttTicketResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMqttTicketResponseBody body;

    public static GetMqttTicketResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMqttTicketResponse self = new GetMqttTicketResponse();
        return TeaModel.build(map, self);
    }

    public GetMqttTicketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMqttTicketResponse setBody(GetMqttTicketResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMqttTicketResponseBody getBody() {
        return this.body;
    }

}
