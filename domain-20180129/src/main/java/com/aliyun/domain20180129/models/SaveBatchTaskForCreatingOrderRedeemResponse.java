// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForCreatingOrderRedeemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveBatchTaskForCreatingOrderRedeemResponseBody body;

    public static SaveBatchTaskForCreatingOrderRedeemResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveBatchTaskForCreatingOrderRedeemResponse self = new SaveBatchTaskForCreatingOrderRedeemResponse();
        return TeaModel.build(map, self);
    }

    public SaveBatchTaskForCreatingOrderRedeemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveBatchTaskForCreatingOrderRedeemResponse setBody(SaveBatchTaskForCreatingOrderRedeemResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveBatchTaskForCreatingOrderRedeemResponseBody getBody() {
        return this.body;
    }

}
