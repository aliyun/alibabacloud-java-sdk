// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListAINodePoolsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAINodePoolsResponseBody body;

    public static ListAINodePoolsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAINodePoolsResponse self = new ListAINodePoolsResponse();
        return TeaModel.build(map, self);
    }

    public ListAINodePoolsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAINodePoolsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAINodePoolsResponse setBody(ListAINodePoolsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAINodePoolsResponseBody getBody() {
        return this.body;
    }

}
