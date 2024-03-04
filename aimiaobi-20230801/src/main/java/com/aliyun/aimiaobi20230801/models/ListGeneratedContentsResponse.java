// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListGeneratedContentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListGeneratedContentsResponseBody body;

    public static ListGeneratedContentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGeneratedContentsResponse self = new ListGeneratedContentsResponse();
        return TeaModel.build(map, self);
    }

    public ListGeneratedContentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGeneratedContentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGeneratedContentsResponse setBody(ListGeneratedContentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGeneratedContentsResponseBody getBody() {
        return this.body;
    }

}
