// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForCreatingOrderRenewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveSingleTaskForCreatingOrderRenewResponseBody body;

    public static SaveSingleTaskForCreatingOrderRenewResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForCreatingOrderRenewResponse self = new SaveSingleTaskForCreatingOrderRenewResponse();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForCreatingOrderRenewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveSingleTaskForCreatingOrderRenewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveSingleTaskForCreatingOrderRenewResponse setBody(SaveSingleTaskForCreatingOrderRenewResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveSingleTaskForCreatingOrderRenewResponseBody getBody() {
        return this.body;
    }

}
