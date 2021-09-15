// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListSystemModelsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSystemModelsResponseBody body;

    public static ListSystemModelsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSystemModelsResponse self = new ListSystemModelsResponse();
        return TeaModel.build(map, self);
    }

    public ListSystemModelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSystemModelsResponse setBody(ListSystemModelsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSystemModelsResponseBody getBody() {
        return this.body;
    }

}
