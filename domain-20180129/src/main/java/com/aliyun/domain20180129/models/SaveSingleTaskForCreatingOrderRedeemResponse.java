// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForCreatingOrderRedeemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public SaveSingleTaskForCreatingOrderRedeemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveSingleTaskForCreatingOrderRedeemResponse setBody(SaveSingleTaskForCreatingOrderRedeemResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveSingleTaskForCreatingOrderRedeemResponseBody getBody() {
        return this.body;
    }

}
