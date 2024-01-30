// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForCreatingOrderActivateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveBatchTaskForCreatingOrderActivateResponseBody body;

    public static SaveBatchTaskForCreatingOrderActivateResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveBatchTaskForCreatingOrderActivateResponse self = new SaveBatchTaskForCreatingOrderActivateResponse();
        return TeaModel.build(map, self);
    }

    public SaveBatchTaskForCreatingOrderActivateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveBatchTaskForCreatingOrderActivateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveBatchTaskForCreatingOrderActivateResponse setBody(SaveBatchTaskForCreatingOrderActivateResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveBatchTaskForCreatingOrderActivateResponseBody getBody() {
        return this.body;
    }

}
