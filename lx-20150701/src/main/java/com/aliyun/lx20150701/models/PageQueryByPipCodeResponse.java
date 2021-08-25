// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lx20150701.models;

import com.aliyun.tea.*;

public class PageQueryByPipCodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PageQueryByPipCodeResponseBody body;

    public static PageQueryByPipCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        PageQueryByPipCodeResponse self = new PageQueryByPipCodeResponse();
        return TeaModel.build(map, self);
    }

    public PageQueryByPipCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PageQueryByPipCodeResponse setBody(PageQueryByPipCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public PageQueryByPipCodeResponseBody getBody() {
        return this.body;
    }

}
