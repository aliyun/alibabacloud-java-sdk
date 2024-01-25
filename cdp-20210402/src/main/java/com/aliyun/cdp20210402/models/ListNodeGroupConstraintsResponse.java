// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class ListNodeGroupConstraintsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListNodeGroupConstraintsResponseBody body;

    public static ListNodeGroupConstraintsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNodeGroupConstraintsResponse self = new ListNodeGroupConstraintsResponse();
        return TeaModel.build(map, self);
    }

    public ListNodeGroupConstraintsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNodeGroupConstraintsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNodeGroupConstraintsResponse setBody(ListNodeGroupConstraintsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNodeGroupConstraintsResponseBody getBody() {
        return this.body;
    }

}
