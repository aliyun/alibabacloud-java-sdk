// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpsertQualityTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpsertQualityTemplateResponseBody body;

    public static UpsertQualityTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpsertQualityTemplateResponse self = new UpsertQualityTemplateResponse();
        return TeaModel.build(map, self);
    }

    public UpsertQualityTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpsertQualityTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpsertQualityTemplateResponse setBody(UpsertQualityTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpsertQualityTemplateResponseBody getBody() {
        return this.body;
    }

}
