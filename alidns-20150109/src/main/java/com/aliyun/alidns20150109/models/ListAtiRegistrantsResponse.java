// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ListAtiRegistrantsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAtiRegistrantsResponseBody body;

    public static ListAtiRegistrantsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAtiRegistrantsResponse self = new ListAtiRegistrantsResponse();
        return TeaModel.build(map, self);
    }

    public ListAtiRegistrantsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAtiRegistrantsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAtiRegistrantsResponse setBody(ListAtiRegistrantsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAtiRegistrantsResponseBody getBody() {
        return this.body;
    }

}
