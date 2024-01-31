// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class ListLdpsComputeGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLdpsComputeGroupsResponseBody body;

    public static ListLdpsComputeGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLdpsComputeGroupsResponse self = new ListLdpsComputeGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListLdpsComputeGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLdpsComputeGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLdpsComputeGroupsResponse setBody(ListLdpsComputeGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLdpsComputeGroupsResponseBody getBody() {
        return this.body;
    }

}
