// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class ListDbfsAttachableEcsInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDbfsAttachableEcsInstancesResponseBody body;

    public static ListDbfsAttachableEcsInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDbfsAttachableEcsInstancesResponse self = new ListDbfsAttachableEcsInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListDbfsAttachableEcsInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDbfsAttachableEcsInstancesResponse setBody(ListDbfsAttachableEcsInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDbfsAttachableEcsInstancesResponseBody getBody() {
        return this.body;
    }

}
