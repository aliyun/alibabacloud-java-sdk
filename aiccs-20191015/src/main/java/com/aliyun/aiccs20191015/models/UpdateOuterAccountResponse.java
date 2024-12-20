// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class UpdateOuterAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateOuterAccountResponseBody body;

    public static UpdateOuterAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateOuterAccountResponse self = new UpdateOuterAccountResponse();
        return TeaModel.build(map, self);
    }

    public UpdateOuterAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateOuterAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateOuterAccountResponse setBody(UpdateOuterAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateOuterAccountResponseBody getBody() {
        return this.body;
    }

}
