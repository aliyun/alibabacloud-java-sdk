// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListQuickQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListQuickQueryResponseBody body;

    public static ListQuickQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListQuickQueryResponse self = new ListQuickQueryResponse();
        return TeaModel.build(map, self);
    }

    public ListQuickQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListQuickQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListQuickQueryResponse setBody(ListQuickQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public ListQuickQueryResponseBody getBody() {
        return this.body;
    }

}
