// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class UpdateCrossAccountsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCrossAccountsResponseBody body;

    public static UpdateCrossAccountsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCrossAccountsResponse self = new UpdateCrossAccountsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCrossAccountsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCrossAccountsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCrossAccountsResponse setBody(UpdateCrossAccountsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCrossAccountsResponseBody getBody() {
        return this.body;
    }

}
