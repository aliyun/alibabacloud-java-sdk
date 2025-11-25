// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class GetKyuubiServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetKyuubiServiceResponseBody body;

    public static GetKyuubiServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetKyuubiServiceResponse self = new GetKyuubiServiceResponse();
        return TeaModel.build(map, self);
    }

    public GetKyuubiServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetKyuubiServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetKyuubiServiceResponse setBody(GetKyuubiServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetKyuubiServiceResponseBody getBody() {
        return this.body;
    }

}
