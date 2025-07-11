// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListBindingRelationsForFlowVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListBindingRelationsForFlowVersionResponseBody body;

    public static ListBindingRelationsForFlowVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBindingRelationsForFlowVersionResponse self = new ListBindingRelationsForFlowVersionResponse();
        return TeaModel.build(map, self);
    }

    public ListBindingRelationsForFlowVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBindingRelationsForFlowVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBindingRelationsForFlowVersionResponse setBody(ListBindingRelationsForFlowVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBindingRelationsForFlowVersionResponseBody getBody() {
        return this.body;
    }

}
