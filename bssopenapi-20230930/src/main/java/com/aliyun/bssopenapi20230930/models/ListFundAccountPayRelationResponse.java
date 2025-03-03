// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class ListFundAccountPayRelationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFundAccountPayRelationResponseBody body;

    public static ListFundAccountPayRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFundAccountPayRelationResponse self = new ListFundAccountPayRelationResponse();
        return TeaModel.build(map, self);
    }

    public ListFundAccountPayRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFundAccountPayRelationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFundAccountPayRelationResponse setBody(ListFundAccountPayRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFundAccountPayRelationResponseBody getBody() {
        return this.body;
    }

}
