// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListLogicModelsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLogicModelsResponseBody body;

    public static ListLogicModelsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLogicModelsResponse self = new ListLogicModelsResponse();
        return TeaModel.build(map, self);
    }

    public ListLogicModelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLogicModelsResponse setBody(ListLogicModelsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLogicModelsResponseBody getBody() {
        return this.body;
    }

}
