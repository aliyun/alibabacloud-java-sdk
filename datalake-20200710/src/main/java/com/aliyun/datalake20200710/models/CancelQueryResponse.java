// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class CancelQueryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CancelQueryResponseBody body;

    public static CancelQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelQueryResponse self = new CancelQueryResponse();
        return TeaModel.build(map, self);
    }

    public CancelQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelQueryResponse setBody(CancelQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelQueryResponseBody getBody() {
        return this.body;
    }

}
