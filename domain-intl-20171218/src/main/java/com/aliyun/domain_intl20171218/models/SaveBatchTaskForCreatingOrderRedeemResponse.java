// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForCreatingOrderRedeemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public SaveBatchTaskForCreatingOrderRedeemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveBatchTaskForCreatingOrderRedeemResponse setBody(SaveBatchTaskForCreatingOrderRedeemResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveBatchTaskForCreatingOrderRedeemResponseBody getBody() {
        return this.body;
    }

}
