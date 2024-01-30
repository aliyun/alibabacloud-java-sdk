// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForCreatingOrderRenewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public SaveBatchTaskForCreatingOrderRenewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveBatchTaskForCreatingOrderRenewResponse setBody(SaveBatchTaskForCreatingOrderRenewResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveBatchTaskForCreatingOrderRenewResponseBody getBody() {
        return this.body;
    }

}
