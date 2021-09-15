// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListPageModelsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListPageModelsResponseBody body;

    public static ListPageModelsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPageModelsResponse self = new ListPageModelsResponse();
        return TeaModel.build(map, self);
    }

    public ListPageModelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPageModelsResponse setBody(ListPageModelsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPageModelsResponseBody getBody() {
        return this.body;
    }

}
