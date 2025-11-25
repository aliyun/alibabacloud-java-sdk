// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class DeleteKyuubiServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteKyuubiServiceResponseBody body;

    public static DeleteKyuubiServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteKyuubiServiceResponse self = new DeleteKyuubiServiceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteKyuubiServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteKyuubiServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteKyuubiServiceResponse setBody(DeleteKyuubiServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteKyuubiServiceResponseBody getBody() {
        return this.body;
    }

}
