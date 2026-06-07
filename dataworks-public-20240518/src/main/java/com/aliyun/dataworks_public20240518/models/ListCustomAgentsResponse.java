// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListCustomAgentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCustomAgentsResponseBody body;

    public static ListCustomAgentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCustomAgentsResponse self = new ListCustomAgentsResponse();
        return TeaModel.build(map, self);
    }

    public ListCustomAgentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCustomAgentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCustomAgentsResponse setBody(ListCustomAgentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCustomAgentsResponseBody getBody() {
        return this.body;
    }

}
