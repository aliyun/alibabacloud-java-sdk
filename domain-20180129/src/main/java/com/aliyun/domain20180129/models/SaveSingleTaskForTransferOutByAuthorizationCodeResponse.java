// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForTransferOutByAuthorizationCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveSingleTaskForTransferOutByAuthorizationCodeResponseBody body;

    public static SaveSingleTaskForTransferOutByAuthorizationCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForTransferOutByAuthorizationCodeResponse self = new SaveSingleTaskForTransferOutByAuthorizationCodeResponse();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForTransferOutByAuthorizationCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveSingleTaskForTransferOutByAuthorizationCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveSingleTaskForTransferOutByAuthorizationCodeResponse setBody(SaveSingleTaskForTransferOutByAuthorizationCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveSingleTaskForTransferOutByAuthorizationCodeResponseBody getBody() {
        return this.body;
    }

}
