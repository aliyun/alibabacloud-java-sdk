// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListModelVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListModelVersionsResponseBody body;

    public static ListModelVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListModelVersionsResponse self = new ListModelVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListModelVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListModelVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListModelVersionsResponse setBody(ListModelVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListModelVersionsResponseBody getBody() {
        return this.body;
    }

}
