// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForCreatingOrderActivateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveSingleTaskForCreatingOrderActivateResponseBody body;

    public static SaveSingleTaskForCreatingOrderActivateResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForCreatingOrderActivateResponse self = new SaveSingleTaskForCreatingOrderActivateResponse();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForCreatingOrderActivateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveSingleTaskForCreatingOrderActivateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveSingleTaskForCreatingOrderActivateResponse setBody(SaveSingleTaskForCreatingOrderActivateResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveSingleTaskForCreatingOrderActivateResponseBody getBody() {
        return this.body;
    }

}
