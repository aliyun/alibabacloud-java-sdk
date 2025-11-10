// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpsertUmodelCommonSchemaRefResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpsertUmodelCommonSchemaRefResponseBody body;

    public static UpsertUmodelCommonSchemaRefResponse build(java.util.Map<String, ?> map) throws Exception {
        UpsertUmodelCommonSchemaRefResponse self = new UpsertUmodelCommonSchemaRefResponse();
        return TeaModel.build(map, self);
    }

    public UpsertUmodelCommonSchemaRefResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpsertUmodelCommonSchemaRefResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpsertUmodelCommonSchemaRefResponse setBody(UpsertUmodelCommonSchemaRefResponseBody body) {
        this.body = body;
        return this;
    }
    public UpsertUmodelCommonSchemaRefResponseBody getBody() {
        return this.body;
    }

}
