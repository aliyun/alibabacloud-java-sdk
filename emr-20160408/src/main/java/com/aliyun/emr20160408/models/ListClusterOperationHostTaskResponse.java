// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListClusterOperationHostTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListClusterOperationHostTaskResponseBody body;

    public static ListClusterOperationHostTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClusterOperationHostTaskResponse self = new ListClusterOperationHostTaskResponse();
        return TeaModel.build(map, self);
    }

    public ListClusterOperationHostTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClusterOperationHostTaskResponse setBody(ListClusterOperationHostTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClusterOperationHostTaskResponseBody getBody() {
        return this.body;
    }

}
