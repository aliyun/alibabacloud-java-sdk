// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class SwitchApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SwitchApiResponseBody body;

    public static SwitchApiResponse build(java.util.Map<String, ?> map) throws Exception {
        SwitchApiResponse self = new SwitchApiResponse();
        return TeaModel.build(map, self);
    }

    public SwitchApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SwitchApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SwitchApiResponse setBody(SwitchApiResponseBody body) {
        this.body = body;
        return this;
    }
    public SwitchApiResponseBody getBody() {
        return this.body;
    }

}
