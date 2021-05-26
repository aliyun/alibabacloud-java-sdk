// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class PageQueryTicketsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PageQueryTicketsResponseBody body;

    public static PageQueryTicketsResponse build(java.util.Map<String, ?> map) throws Exception {
        PageQueryTicketsResponse self = new PageQueryTicketsResponse();
        return TeaModel.build(map, self);
    }

    public PageQueryTicketsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PageQueryTicketsResponse setBody(PageQueryTicketsResponseBody body) {
        this.body = body;
        return this;
    }
    public PageQueryTicketsResponseBody getBody() {
        return this.body;
    }

}
