// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SearchTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchTemplateResponseBody body;

    public static SearchTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchTemplateResponse self = new SearchTemplateResponse();
        return TeaModel.build(map, self);
    }

    public SearchTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchTemplateResponse setBody(SearchTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchTemplateResponseBody getBody() {
        return this.body;
    }

}
