// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForCreatingOrderRedeemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveSingleTaskForCreatingOrderRedeemResponseBody body;

    public static SaveSingleTaskForCreatingOrderRedeemResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForCreatingOrderRedeemResponse self = new SaveSingleTaskForCreatingOrderRedeemResponse();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForCreatingOrderRedeemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveSingleTaskForCreatingOrderRedeemResponse setBody(SaveSingleTaskForCreatingOrderRedeemResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveSingleTaskForCreatingOrderRedeemResponseBody getBody() {
        return this.body;
    }

}
