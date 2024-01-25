// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListPolicesForPrivateAccessTagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPolicesForPrivateAccessTagResponseBody body;

    public static ListPolicesForPrivateAccessTagResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPolicesForPrivateAccessTagResponse self = new ListPolicesForPrivateAccessTagResponse();
        return TeaModel.build(map, self);
    }

    public ListPolicesForPrivateAccessTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPolicesForPrivateAccessTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPolicesForPrivateAccessTagResponse setBody(ListPolicesForPrivateAccessTagResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPolicesForPrivateAccessTagResponseBody getBody() {
        return this.body;
    }

}
