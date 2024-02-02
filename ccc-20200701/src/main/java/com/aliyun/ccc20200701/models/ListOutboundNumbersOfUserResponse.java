// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListOutboundNumbersOfUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOutboundNumbersOfUserResponseBody body;

    public static ListOutboundNumbersOfUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOutboundNumbersOfUserResponse self = new ListOutboundNumbersOfUserResponse();
        return TeaModel.build(map, self);
    }

    public ListOutboundNumbersOfUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOutboundNumbersOfUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOutboundNumbersOfUserResponse setBody(ListOutboundNumbersOfUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOutboundNumbersOfUserResponseBody getBody() {
        return this.body;
    }

}
