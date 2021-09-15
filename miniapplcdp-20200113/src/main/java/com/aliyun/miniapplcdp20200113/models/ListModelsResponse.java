// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListModelsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListModelsResponseBody body;

    public static ListModelsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListModelsResponse self = new ListModelsResponse();
        return TeaModel.build(map, self);
    }

    public ListModelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListModelsResponse setBody(ListModelsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListModelsResponseBody getBody() {
        return this.body;
    }

}
