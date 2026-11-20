// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class CreateSecretTransferRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSecretTransferRecordResponseBody body;

    public static CreateSecretTransferRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSecretTransferRecordResponse self = new CreateSecretTransferRecordResponse();
        return TeaModel.build(map, self);
    }

    public CreateSecretTransferRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSecretTransferRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSecretTransferRecordResponse setBody(CreateSecretTransferRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSecretTransferRecordResponseBody getBody() {
        return this.body;
    }

}
