// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetTemplateParamsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTemplateParamsResponseBody body;

    public static GetTemplateParamsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateParamsResponse self = new GetTemplateParamsResponse();
        return TeaModel.build(map, self);
    }

    public GetTemplateParamsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTemplateParamsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTemplateParamsResponse setBody(GetTemplateParamsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTemplateParamsResponseBody getBody() {
        return this.body;
    }

}
