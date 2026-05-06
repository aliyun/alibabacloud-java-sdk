// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetModelProviderTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetModelProviderTemplateResponseBody body;

    public static GetModelProviderTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetModelProviderTemplateResponse self = new GetModelProviderTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetModelProviderTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetModelProviderTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetModelProviderTemplateResponse setBody(GetModelProviderTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetModelProviderTemplateResponseBody getBody() {
        return this.body;
    }

}
