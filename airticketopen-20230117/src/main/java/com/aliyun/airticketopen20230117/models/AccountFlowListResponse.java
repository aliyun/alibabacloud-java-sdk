// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class AccountFlowListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AccountFlowListResponseBody body;

    public static AccountFlowListResponse build(java.util.Map<String, ?> map) throws Exception {
        AccountFlowListResponse self = new AccountFlowListResponse();
        return TeaModel.build(map, self);
    }

    public AccountFlowListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AccountFlowListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AccountFlowListResponse setBody(AccountFlowListResponseBody body) {
        this.body = body;
        return this;
    }
    public AccountFlowListResponseBody getBody() {
        return this.body;
    }

}
