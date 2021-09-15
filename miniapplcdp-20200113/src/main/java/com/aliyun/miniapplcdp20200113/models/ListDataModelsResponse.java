// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListDataModelsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDataModelsResponseBody body;

    public static ListDataModelsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataModelsResponse self = new ListDataModelsResponse();
        return TeaModel.build(map, self);
    }

    public ListDataModelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataModelsResponse setBody(ListDataModelsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataModelsResponseBody getBody() {
        return this.body;
    }

}
