// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListNodesNoPagingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListNodesNoPagingResponseBody body;

    public static ListNodesNoPagingResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNodesNoPagingResponse self = new ListNodesNoPagingResponse();
        return TeaModel.build(map, self);
    }

    public ListNodesNoPagingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNodesNoPagingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNodesNoPagingResponse setBody(ListNodesNoPagingResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNodesNoPagingResponseBody getBody() {
        return this.body;
    }

}
