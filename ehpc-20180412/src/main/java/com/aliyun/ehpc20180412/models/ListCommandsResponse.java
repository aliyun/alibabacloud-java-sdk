// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListCommandsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCommandsResponseBody body;

    public static ListCommandsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCommandsResponse self = new ListCommandsResponse();
        return TeaModel.build(map, self);
    }

    public ListCommandsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCommandsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCommandsResponse setBody(ListCommandsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCommandsResponseBody getBody() {
        return this.body;
    }

}
