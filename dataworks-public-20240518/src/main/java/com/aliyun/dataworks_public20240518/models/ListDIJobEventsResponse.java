// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDIJobEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDIJobEventsResponseBody body;

    public static ListDIJobEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDIJobEventsResponse self = new ListDIJobEventsResponse();
        return TeaModel.build(map, self);
    }

    public ListDIJobEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDIJobEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDIJobEventsResponse setBody(ListDIJobEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDIJobEventsResponseBody getBody() {
        return this.body;
    }

}
