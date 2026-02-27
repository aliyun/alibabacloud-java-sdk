// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ResetDataServiceAppSecretResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetDataServiceAppSecretResponseBody body;

    public static ResetDataServiceAppSecretResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetDataServiceAppSecretResponse self = new ResetDataServiceAppSecretResponse();
        return TeaModel.build(map, self);
    }

    public ResetDataServiceAppSecretResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetDataServiceAppSecretResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetDataServiceAppSecretResponse setBody(ResetDataServiceAppSecretResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetDataServiceAppSecretResponseBody getBody() {
        return this.body;
    }

}
