// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForCancelingTransferInResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveSingleTaskForCancelingTransferInResponseBody body;

    public static SaveSingleTaskForCancelingTransferInResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForCancelingTransferInResponse self = new SaveSingleTaskForCancelingTransferInResponse();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForCancelingTransferInResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveSingleTaskForCancelingTransferInResponse setBody(SaveSingleTaskForCancelingTransferInResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveSingleTaskForCancelingTransferInResponseBody getBody() {
        return this.body;
    }

}
