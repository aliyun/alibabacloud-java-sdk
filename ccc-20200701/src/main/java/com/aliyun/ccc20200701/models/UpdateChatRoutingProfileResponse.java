// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class UpdateChatRoutingProfileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateChatRoutingProfileResponseBody body;

    public static UpdateChatRoutingProfileResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateChatRoutingProfileResponse self = new UpdateChatRoutingProfileResponse();
        return TeaModel.build(map, self);
    }

    public UpdateChatRoutingProfileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateChatRoutingProfileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateChatRoutingProfileResponse setBody(UpdateChatRoutingProfileResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateChatRoutingProfileResponseBody getBody() {
        return this.body;
    }

}
