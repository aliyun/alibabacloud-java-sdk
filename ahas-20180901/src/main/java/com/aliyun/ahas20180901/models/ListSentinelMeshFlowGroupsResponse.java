// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListSentinelMeshFlowGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListSentinelMeshFlowGroupsResponseBody body;

    public static ListSentinelMeshFlowGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSentinelMeshFlowGroupsResponse self = new ListSentinelMeshFlowGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListSentinelMeshFlowGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSentinelMeshFlowGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSentinelMeshFlowGroupsResponse setBody(ListSentinelMeshFlowGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSentinelMeshFlowGroupsResponseBody getBody() {
        return this.body;
    }

}
