// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class CreateFundAccountPayRelationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateFundAccountPayRelationResponseBody body;

    public static CreateFundAccountPayRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFundAccountPayRelationResponse self = new CreateFundAccountPayRelationResponse();
        return TeaModel.build(map, self);
    }

    public CreateFundAccountPayRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFundAccountPayRelationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFundAccountPayRelationResponse setBody(CreateFundAccountPayRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFundAccountPayRelationResponseBody getBody() {
        return this.body;
    }

}
