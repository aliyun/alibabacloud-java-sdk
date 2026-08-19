// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdatePrivateAccessApplicationL7SwitchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePrivateAccessApplicationL7SwitchResponseBody body;

    public static UpdatePrivateAccessApplicationL7SwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrivateAccessApplicationL7SwitchResponse self = new UpdatePrivateAccessApplicationL7SwitchResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePrivateAccessApplicationL7SwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePrivateAccessApplicationL7SwitchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePrivateAccessApplicationL7SwitchResponse setBody(UpdatePrivateAccessApplicationL7SwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePrivateAccessApplicationL7SwitchResponseBody getBody() {
        return this.body;
    }

}
