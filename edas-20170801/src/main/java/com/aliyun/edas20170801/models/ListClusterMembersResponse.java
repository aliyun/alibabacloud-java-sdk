// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListClusterMembersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListClusterMembersResponseBody body;

    public static ListClusterMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClusterMembersResponse self = new ListClusterMembersResponse();
        return TeaModel.build(map, self);
    }

    public ListClusterMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClusterMembersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListClusterMembersResponse setBody(ListClusterMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClusterMembersResponseBody getBody() {
        return this.body;
    }

}
