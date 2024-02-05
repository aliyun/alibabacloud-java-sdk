// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetTemplateListByUserIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTemplateListByUserIdResponseBody body;

    public static GetTemplateListByUserIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateListByUserIdResponse self = new GetTemplateListByUserIdResponse();
        return TeaModel.build(map, self);
    }

    public GetTemplateListByUserIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTemplateListByUserIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTemplateListByUserIdResponse setBody(GetTemplateListByUserIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTemplateListByUserIdResponseBody getBody() {
        return this.body;
    }

}
