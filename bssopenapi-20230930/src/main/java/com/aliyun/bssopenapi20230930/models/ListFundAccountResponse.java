// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class ListFundAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFundAccountResponseBody body;

    public static ListFundAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFundAccountResponse self = new ListFundAccountResponse();
        return TeaModel.build(map, self);
    }

    public ListFundAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFundAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFundAccountResponse setBody(ListFundAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFundAccountResponseBody getBody() {
        return this.body;
    }

}
