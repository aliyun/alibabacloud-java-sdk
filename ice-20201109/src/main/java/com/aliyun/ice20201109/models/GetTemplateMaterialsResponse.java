// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetTemplateMaterialsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTemplateMaterialsResponseBody body;

    public static GetTemplateMaterialsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateMaterialsResponse self = new GetTemplateMaterialsResponse();
        return TeaModel.build(map, self);
    }

    public GetTemplateMaterialsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTemplateMaterialsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTemplateMaterialsResponse setBody(GetTemplateMaterialsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTemplateMaterialsResponseBody getBody() {
        return this.body;
    }

}
