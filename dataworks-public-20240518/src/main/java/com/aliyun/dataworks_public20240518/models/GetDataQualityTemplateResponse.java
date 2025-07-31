// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetDataQualityTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataQualityTemplateResponseBody body;

    public static GetDataQualityTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataQualityTemplateResponse self = new GetDataQualityTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetDataQualityTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataQualityTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataQualityTemplateResponse setBody(GetDataQualityTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataQualityTemplateResponseBody getBody() {
        return this.body;
    }

}
