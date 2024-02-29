// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetOpSensitiveDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOpSensitiveDataResponseBody body;

    public static GetOpSensitiveDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOpSensitiveDataResponse self = new GetOpSensitiveDataResponse();
        return TeaModel.build(map, self);
    }

    public GetOpSensitiveDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOpSensitiveDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOpSensitiveDataResponse setBody(GetOpSensitiveDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOpSensitiveDataResponseBody getBody() {
        return this.body;
    }

}
