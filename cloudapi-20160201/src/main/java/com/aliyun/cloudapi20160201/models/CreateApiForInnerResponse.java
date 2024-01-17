// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class CreateApiForInnerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateApiForInnerResponseBody body;

    public static CreateApiForInnerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateApiForInnerResponse self = new CreateApiForInnerResponse();
        return TeaModel.build(map, self);
    }

    public CreateApiForInnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateApiForInnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateApiForInnerResponse setBody(CreateApiForInnerResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateApiForInnerResponseBody getBody() {
        return this.body;
    }

}
