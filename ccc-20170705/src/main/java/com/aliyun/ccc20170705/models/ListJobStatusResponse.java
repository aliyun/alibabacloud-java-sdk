// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListJobStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListJobStatusResponseBody body;

    public static ListJobStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ListJobStatusResponse self = new ListJobStatusResponse();
        return TeaModel.build(map, self);
    }

    public ListJobStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListJobStatusResponse setBody(ListJobStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ListJobStatusResponseBody getBody() {
        return this.body;
    }

}
