// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListTaskByPageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListTaskByPageResponseBody body;

    public static ListTaskByPageResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTaskByPageResponse self = new ListTaskByPageResponse();
        return TeaModel.build(map, self);
    }

    public ListTaskByPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTaskByPageResponse setBody(ListTaskByPageResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTaskByPageResponseBody getBody() {
        return this.body;
    }

}
