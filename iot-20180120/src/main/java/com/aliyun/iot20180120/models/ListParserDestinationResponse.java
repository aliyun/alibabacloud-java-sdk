// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListParserDestinationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListParserDestinationResponseBody body;

    public static ListParserDestinationResponse build(java.util.Map<String, ?> map) throws Exception {
        ListParserDestinationResponse self = new ListParserDestinationResponse();
        return TeaModel.build(map, self);
    }

    public ListParserDestinationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListParserDestinationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListParserDestinationResponse setBody(ListParserDestinationResponseBody body) {
        this.body = body;
        return this;
    }
    public ListParserDestinationResponseBody getBody() {
        return this.body;
    }

}
