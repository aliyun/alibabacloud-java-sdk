// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListWuyingServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWuyingServerResponseBody body;

    public static ListWuyingServerResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWuyingServerResponse self = new ListWuyingServerResponse();
        return TeaModel.build(map, self);
    }

    public ListWuyingServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWuyingServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWuyingServerResponse setBody(ListWuyingServerResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWuyingServerResponseBody getBody() {
        return this.body;
    }

}
