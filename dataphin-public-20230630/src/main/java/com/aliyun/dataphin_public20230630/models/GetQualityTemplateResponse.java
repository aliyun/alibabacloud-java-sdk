// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetQualityTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetQualityTemplateResponseBody body;

    public static GetQualityTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQualityTemplateResponse self = new GetQualityTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetQualityTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQualityTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetQualityTemplateResponse setBody(GetQualityTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQualityTemplateResponseBody getBody() {
        return this.body;
    }

}
