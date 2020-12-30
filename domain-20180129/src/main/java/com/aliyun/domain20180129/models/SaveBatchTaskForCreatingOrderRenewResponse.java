// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForCreatingOrderRenewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveBatchTaskForCreatingOrderRenewResponseBody body;

    public static SaveBatchTaskForCreatingOrderRenewResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveBatchTaskForCreatingOrderRenewResponse self = new SaveBatchTaskForCreatingOrderRenewResponse();
        return TeaModel.build(map, self);
    }

    public SaveBatchTaskForCreatingOrderRenewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveBatchTaskForCreatingOrderRenewResponse setBody(SaveBatchTaskForCreatingOrderRenewResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveBatchTaskForCreatingOrderRenewResponseBody getBody() {
        return this.body;
    }

}
