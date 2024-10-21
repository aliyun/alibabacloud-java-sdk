// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForTransferOutByAuthorizationCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveBatchTaskForTransferOutByAuthorizationCodeResponseBody body;

    public static SaveBatchTaskForTransferOutByAuthorizationCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveBatchTaskForTransferOutByAuthorizationCodeResponse self = new SaveBatchTaskForTransferOutByAuthorizationCodeResponse();
        return TeaModel.build(map, self);
    }

    public SaveBatchTaskForTransferOutByAuthorizationCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveBatchTaskForTransferOutByAuthorizationCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveBatchTaskForTransferOutByAuthorizationCodeResponse setBody(SaveBatchTaskForTransferOutByAuthorizationCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveBatchTaskForTransferOutByAuthorizationCodeResponseBody getBody() {
        return this.body;
    }

}
