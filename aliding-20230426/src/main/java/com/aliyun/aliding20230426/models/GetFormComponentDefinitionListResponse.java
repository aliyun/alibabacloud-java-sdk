// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetFormComponentDefinitionListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFormComponentDefinitionListResponseBody body;

    public static GetFormComponentDefinitionListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFormComponentDefinitionListResponse self = new GetFormComponentDefinitionListResponse();
        return TeaModel.build(map, self);
    }

    public GetFormComponentDefinitionListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFormComponentDefinitionListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFormComponentDefinitionListResponse setBody(GetFormComponentDefinitionListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFormComponentDefinitionListResponseBody getBody() {
        return this.body;
    }

}
