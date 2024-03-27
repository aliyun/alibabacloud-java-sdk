// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetAuthorityTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAuthorityTemplateResponseBody body;

    public static GetAuthorityTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAuthorityTemplateResponse self = new GetAuthorityTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetAuthorityTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAuthorityTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAuthorityTemplateResponse setBody(GetAuthorityTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAuthorityTemplateResponseBody getBody() {
        return this.body;
    }

}
