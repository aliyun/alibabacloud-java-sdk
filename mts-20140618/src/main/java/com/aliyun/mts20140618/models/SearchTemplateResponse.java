// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SearchTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public SearchTemplateResponse setBody(SearchTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchTemplateResponseBody getBody() {
        return this.body;
    }

}
