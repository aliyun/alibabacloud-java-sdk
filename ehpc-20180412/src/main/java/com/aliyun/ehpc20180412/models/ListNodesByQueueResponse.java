// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListNodesByQueueResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListNodesByQueueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNodesByQueueResponse setBody(ListNodesByQueueResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNodesByQueueResponseBody getBody() {
        return this.body;
    }

}
