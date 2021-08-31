// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListPipelinesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListPipelinesResponseBody body;

    public static ListPipelinesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPipelinesResponse self = new ListPipelinesResponse();
        return TeaModel.build(map, self);
    }

    public ListPipelinesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPipelinesResponse setBody(ListPipelinesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPipelinesResponseBody getBody() {
        return this.body;
    }

}
