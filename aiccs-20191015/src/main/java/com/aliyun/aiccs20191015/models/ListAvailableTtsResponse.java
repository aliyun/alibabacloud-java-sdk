// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ListAvailableTtsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAvailableTtsResponseBody body;

    public static ListAvailableTtsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAvailableTtsResponse self = new ListAvailableTtsResponse();
        return TeaModel.build(map, self);
    }

    public ListAvailableTtsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAvailableTtsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAvailableTtsResponse setBody(ListAvailableTtsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAvailableTtsResponseBody getBody() {
        return this.body;
    }

}
