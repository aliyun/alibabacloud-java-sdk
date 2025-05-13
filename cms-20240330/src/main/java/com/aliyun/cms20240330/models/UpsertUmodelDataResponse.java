// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpsertUmodelDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpsertUmodelDataResponseBody body;

    public static UpsertUmodelDataResponse build(java.util.Map<String, ?> map) throws Exception {
        UpsertUmodelDataResponse self = new UpsertUmodelDataResponse();
        return TeaModel.build(map, self);
    }

    public UpsertUmodelDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpsertUmodelDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpsertUmodelDataResponse setBody(UpsertUmodelDataResponseBody body) {
        this.body = body;
        return this;
    }
    public UpsertUmodelDataResponseBody getBody() {
        return this.body;
    }

}
