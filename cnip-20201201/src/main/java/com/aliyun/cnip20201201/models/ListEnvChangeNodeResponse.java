// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListEnvChangeNodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListEnvChangeNodeResponseBody body;

    public static ListEnvChangeNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEnvChangeNodeResponse self = new ListEnvChangeNodeResponse();
        return TeaModel.build(map, self);
    }

    public ListEnvChangeNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEnvChangeNodeResponse setBody(ListEnvChangeNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEnvChangeNodeResponseBody getBody() {
        return this.body;
    }

}
