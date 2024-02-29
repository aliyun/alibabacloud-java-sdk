// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetSensitiveDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSensitiveDataResponseBody body;

    public static GetSensitiveDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSensitiveDataResponse self = new GetSensitiveDataResponse();
        return TeaModel.build(map, self);
    }

    public GetSensitiveDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSensitiveDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSensitiveDataResponse setBody(GetSensitiveDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSensitiveDataResponseBody getBody() {
        return this.body;
    }

}
