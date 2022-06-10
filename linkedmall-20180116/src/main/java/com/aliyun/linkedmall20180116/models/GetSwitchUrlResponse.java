// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class GetSwitchUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetSwitchUrlResponseBody body;

    public static GetSwitchUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSwitchUrlResponse self = new GetSwitchUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetSwitchUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSwitchUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSwitchUrlResponse setBody(GetSwitchUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSwitchUrlResponseBody getBody() {
        return this.body;
    }

}
