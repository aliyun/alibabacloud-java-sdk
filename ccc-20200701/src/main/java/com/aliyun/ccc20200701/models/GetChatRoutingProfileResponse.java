// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetChatRoutingProfileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetChatRoutingProfileResponseBody body;

    public static GetChatRoutingProfileResponse build(java.util.Map<String, ?> map) throws Exception {
        GetChatRoutingProfileResponse self = new GetChatRoutingProfileResponse();
        return TeaModel.build(map, self);
    }

    public GetChatRoutingProfileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetChatRoutingProfileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetChatRoutingProfileResponse setBody(GetChatRoutingProfileResponseBody body) {
        this.body = body;
        return this;
    }
    public GetChatRoutingProfileResponseBody getBody() {
        return this.body;
    }

}
