// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListDeployGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDeployGroupResponseBody body;

    public static ListDeployGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDeployGroupResponse self = new ListDeployGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListDeployGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDeployGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDeployGroupResponse setBody(ListDeployGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDeployGroupResponseBody getBody() {
        return this.body;
    }

}
