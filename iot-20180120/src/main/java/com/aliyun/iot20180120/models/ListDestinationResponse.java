// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListDestinationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDestinationResponseBody body;

    public static ListDestinationResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDestinationResponse self = new ListDestinationResponse();
        return TeaModel.build(map, self);
    }

    public ListDestinationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDestinationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDestinationResponse setBody(ListDestinationResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDestinationResponseBody getBody() {
        return this.body;
    }

}
