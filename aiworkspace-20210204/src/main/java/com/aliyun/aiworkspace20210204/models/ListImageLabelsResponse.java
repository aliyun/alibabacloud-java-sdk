// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListImageLabelsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListImageLabelsResponseBody body;

    public static ListImageLabelsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListImageLabelsResponse self = new ListImageLabelsResponse();
        return TeaModel.build(map, self);
    }

    public ListImageLabelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListImageLabelsResponse setBody(ListImageLabelsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListImageLabelsResponseBody getBody() {
        return this.body;
    }

}
