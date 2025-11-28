// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class ListTemplateMaterialResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTemplateMaterialResponseBody body;

    public static ListTemplateMaterialResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTemplateMaterialResponse self = new ListTemplateMaterialResponse();
        return TeaModel.build(map, self);
    }

    public ListTemplateMaterialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTemplateMaterialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTemplateMaterialResponse setBody(ListTemplateMaterialResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTemplateMaterialResponseBody getBody() {
        return this.body;
    }

}
