// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetAuthorityTemplateItemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAuthorityTemplateItemResponseBody body;

    public static GetAuthorityTemplateItemResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAuthorityTemplateItemResponse self = new GetAuthorityTemplateItemResponse();
        return TeaModel.build(map, self);
    }

    public GetAuthorityTemplateItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAuthorityTemplateItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAuthorityTemplateItemResponse setBody(GetAuthorityTemplateItemResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAuthorityTemplateItemResponseBody getBody() {
        return this.body;
    }

}
