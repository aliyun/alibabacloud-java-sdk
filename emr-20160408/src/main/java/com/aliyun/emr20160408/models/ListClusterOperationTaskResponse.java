// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListClusterOperationTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListClusterOperationTaskResponseBody body;

    public static ListClusterOperationTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClusterOperationTaskResponse self = new ListClusterOperationTaskResponse();
        return TeaModel.build(map, self);
    }

    public ListClusterOperationTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClusterOperationTaskResponse setBody(ListClusterOperationTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClusterOperationTaskResponseBody getBody() {
        return this.body;
    }

}
