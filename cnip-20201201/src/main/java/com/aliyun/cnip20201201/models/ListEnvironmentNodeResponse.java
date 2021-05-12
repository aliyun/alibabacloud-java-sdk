// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListEnvironmentNodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListEnvironmentNodeResponseBody body;

    public static ListEnvironmentNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentNodeResponse self = new ListEnvironmentNodeResponse();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEnvironmentNodeResponse setBody(ListEnvironmentNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEnvironmentNodeResponseBody getBody() {
        return this.body;
    }

}
