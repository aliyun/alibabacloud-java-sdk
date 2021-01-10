// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ListDetectProcessesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDetectProcessesResponseBody body;

    public static ListDetectProcessesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDetectProcessesResponse self = new ListDetectProcessesResponse();
        return TeaModel.build(map, self);
    }

    public ListDetectProcessesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDetectProcessesResponse setBody(ListDetectProcessesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDetectProcessesResponseBody getBody() {
        return this.body;
    }

}
