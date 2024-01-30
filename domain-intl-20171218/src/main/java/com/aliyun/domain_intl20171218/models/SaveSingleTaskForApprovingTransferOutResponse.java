// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForApprovingTransferOutResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveSingleTaskForApprovingTransferOutResponseBody body;

    public static SaveSingleTaskForApprovingTransferOutResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForApprovingTransferOutResponse self = new SaveSingleTaskForApprovingTransferOutResponse();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForApprovingTransferOutResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveSingleTaskForApprovingTransferOutResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveSingleTaskForApprovingTransferOutResponse setBody(SaveSingleTaskForApprovingTransferOutResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveSingleTaskForApprovingTransferOutResponseBody getBody() {
        return this.body;
    }

}
