// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListScheduleDutiesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListScheduleDutiesResponseBody body;

    public static ListScheduleDutiesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListScheduleDutiesResponse self = new ListScheduleDutiesResponse();
        return TeaModel.build(map, self);
    }

    public ListScheduleDutiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListScheduleDutiesResponse setBody(ListScheduleDutiesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListScheduleDutiesResponseBody getBody() {
        return this.body;
    }

}
