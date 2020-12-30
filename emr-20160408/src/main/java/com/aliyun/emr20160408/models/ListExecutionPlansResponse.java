// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListExecutionPlansResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListExecutionPlansResponseBody body;

    public static ListExecutionPlansResponse build(java.util.Map<String, ?> map) throws Exception {
        ListExecutionPlansResponse self = new ListExecutionPlansResponse();
        return TeaModel.build(map, self);
    }

    public ListExecutionPlansResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListExecutionPlansResponse setBody(ListExecutionPlansResponseBody body) {
        this.body = body;
        return this;
    }
    public ListExecutionPlansResponseBody getBody() {
        return this.body;
    }

}
