// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListEnvChangeRecordNodesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListEnvChangeRecordNodesResponseBody body;

    public static ListEnvChangeRecordNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEnvChangeRecordNodesResponse self = new ListEnvChangeRecordNodesResponse();
        return TeaModel.build(map, self);
    }

    public ListEnvChangeRecordNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEnvChangeRecordNodesResponse setBody(ListEnvChangeRecordNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEnvChangeRecordNodesResponseBody getBody() {
        return this.body;
    }

}
