// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListCallEventDetailByContactIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCallEventDetailByContactIdResponseBody body;

    public static ListCallEventDetailByContactIdResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCallEventDetailByContactIdResponse self = new ListCallEventDetailByContactIdResponse();
        return TeaModel.build(map, self);
    }

    public ListCallEventDetailByContactIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCallEventDetailByContactIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCallEventDetailByContactIdResponse setBody(ListCallEventDetailByContactIdResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCallEventDetailByContactIdResponseBody getBody() {
        return this.body;
    }

}
