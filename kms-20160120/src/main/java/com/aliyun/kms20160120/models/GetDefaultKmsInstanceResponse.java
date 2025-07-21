// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetDefaultKmsInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDefaultKmsInstanceResponseBody body;

    public static GetDefaultKmsInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDefaultKmsInstanceResponse self = new GetDefaultKmsInstanceResponse();
        return TeaModel.build(map, self);
    }

    public GetDefaultKmsInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDefaultKmsInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDefaultKmsInstanceResponse setBody(GetDefaultKmsInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDefaultKmsInstanceResponseBody getBody() {
        return this.body;
    }

}
