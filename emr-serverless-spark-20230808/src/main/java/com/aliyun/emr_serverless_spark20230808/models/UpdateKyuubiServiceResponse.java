// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class UpdateKyuubiServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateKyuubiServiceResponseBody body;

    public static UpdateKyuubiServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateKyuubiServiceResponse self = new UpdateKyuubiServiceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateKyuubiServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateKyuubiServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateKyuubiServiceResponse setBody(UpdateKyuubiServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateKyuubiServiceResponseBody getBody() {
        return this.body;
    }

}
