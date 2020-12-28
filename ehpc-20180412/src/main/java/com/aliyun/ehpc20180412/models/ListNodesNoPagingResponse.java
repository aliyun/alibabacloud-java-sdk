// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListNodesNoPagingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListNodesNoPagingResponse setBody(ListNodesNoPagingResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNodesNoPagingResponseBody getBody() {
        return this.body;
    }

}
