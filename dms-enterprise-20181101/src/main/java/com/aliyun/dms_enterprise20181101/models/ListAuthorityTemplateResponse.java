// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListAuthorityTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListAuthorityTemplateResponseBody body;

    public static ListAuthorityTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorityTemplateResponse self = new ListAuthorityTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ListAuthorityTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAuthorityTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAuthorityTemplateResponse setBody(ListAuthorityTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAuthorityTemplateResponseBody getBody() {
        return this.body;
    }

}
