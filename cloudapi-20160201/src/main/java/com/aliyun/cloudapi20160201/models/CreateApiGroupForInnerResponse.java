// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class CreateApiGroupForInnerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateApiGroupForInnerResponseBody body;

    public static CreateApiGroupForInnerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateApiGroupForInnerResponse self = new CreateApiGroupForInnerResponse();
        return TeaModel.build(map, self);
    }

    public CreateApiGroupForInnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateApiGroupForInnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateApiGroupForInnerResponse setBody(CreateApiGroupForInnerResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateApiGroupForInnerResponseBody getBody() {
        return this.body;
    }

}
