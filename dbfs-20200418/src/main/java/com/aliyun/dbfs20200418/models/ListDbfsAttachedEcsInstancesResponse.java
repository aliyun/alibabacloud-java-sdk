// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class ListDbfsAttachedEcsInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDbfsAttachedEcsInstancesResponseBody body;

    public static ListDbfsAttachedEcsInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDbfsAttachedEcsInstancesResponse self = new ListDbfsAttachedEcsInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListDbfsAttachedEcsInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDbfsAttachedEcsInstancesResponse setBody(ListDbfsAttachedEcsInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDbfsAttachedEcsInstancesResponseBody getBody() {
        return this.body;
    }

}
