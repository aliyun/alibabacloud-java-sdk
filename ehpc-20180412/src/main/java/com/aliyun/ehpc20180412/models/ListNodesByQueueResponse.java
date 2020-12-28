// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListNodesByQueueResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListNodesByQueueResponseBody body;

    public static ListNodesByQueueResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNodesByQueueResponse self = new ListNodesByQueueResponse();
        return TeaModel.build(map, self);
    }

    public ListNodesByQueueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNodesByQueueResponse setBody(ListNodesByQueueResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNodesByQueueResponseBody getBody() {
        return this.body;
    }

}
