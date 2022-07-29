// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetUnreadMessageCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetUnreadMessageCountResponseBody body;

    public static GetUnreadMessageCountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUnreadMessageCountResponse self = new GetUnreadMessageCountResponse();
        return TeaModel.build(map, self);
    }

    public GetUnreadMessageCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUnreadMessageCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUnreadMessageCountResponse setBody(GetUnreadMessageCountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUnreadMessageCountResponseBody getBody() {
        return this.body;
    }

}
