// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetKmsInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetKmsInstanceResponseBody body;

    public static GetKmsInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetKmsInstanceResponse self = new GetKmsInstanceResponse();
        return TeaModel.build(map, self);
    }

    public GetKmsInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetKmsInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetKmsInstanceResponse setBody(GetKmsInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetKmsInstanceResponseBody getBody() {
        return this.body;
    }

}
