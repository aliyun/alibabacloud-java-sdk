// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ListTemplatePageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTemplatePageResponseBody body;

    public static ListTemplatePageResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTemplatePageResponse self = new ListTemplatePageResponse();
        return TeaModel.build(map, self);
    }

    public ListTemplatePageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTemplatePageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTemplatePageResponse setBody(ListTemplatePageResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTemplatePageResponseBody getBody() {
        return this.body;
    }

}
