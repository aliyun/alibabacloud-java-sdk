// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateAccountInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAccountInfoResponseBody body;

    public static UpdateAccountInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAccountInfoResponse self = new UpdateAccountInfoResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAccountInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAccountInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAccountInfoResponse setBody(UpdateAccountInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAccountInfoResponseBody getBody() {
        return this.body;
    }

}
