// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForApprovingTransferOutResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public SaveSingleTaskForApprovingTransferOutResponse setBody(SaveSingleTaskForApprovingTransferOutResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveSingleTaskForApprovingTransferOutResponseBody getBody() {
        return this.body;
    }

}
