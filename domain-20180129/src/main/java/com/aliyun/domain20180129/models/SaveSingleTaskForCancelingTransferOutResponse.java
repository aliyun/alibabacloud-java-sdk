// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForCancelingTransferOutResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveSingleTaskForCancelingTransferOutResponseBody body;

    public static SaveSingleTaskForCancelingTransferOutResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForCancelingTransferOutResponse self = new SaveSingleTaskForCancelingTransferOutResponse();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForCancelingTransferOutResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveSingleTaskForCancelingTransferOutResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveSingleTaskForCancelingTransferOutResponse setBody(SaveSingleTaskForCancelingTransferOutResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveSingleTaskForCancelingTransferOutResponseBody getBody() {
        return this.body;
    }

}
