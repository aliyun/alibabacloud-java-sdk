// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForQueryingTransferAuthorizationCodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SaveSingleTaskForQueryingTransferAuthorizationCodeResponseBody body;

    public static SaveSingleTaskForQueryingTransferAuthorizationCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForQueryingTransferAuthorizationCodeResponse self = new SaveSingleTaskForQueryingTransferAuthorizationCodeResponse();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForQueryingTransferAuthorizationCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveSingleTaskForQueryingTransferAuthorizationCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveSingleTaskForQueryingTransferAuthorizationCodeResponse setBody(SaveSingleTaskForQueryingTransferAuthorizationCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveSingleTaskForQueryingTransferAuthorizationCodeResponseBody getBody() {
        return this.body;
    }

}
