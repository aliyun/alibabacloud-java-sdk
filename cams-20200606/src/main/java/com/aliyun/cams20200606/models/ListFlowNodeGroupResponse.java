// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListFlowNodeGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFlowNodeGroupResponseBody body;

    public static ListFlowNodeGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFlowNodeGroupResponse self = new ListFlowNodeGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListFlowNodeGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFlowNodeGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFlowNodeGroupResponse setBody(ListFlowNodeGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFlowNodeGroupResponseBody getBody() {
        return this.body;
    }

}
