// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListOperationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOperationResponseBody body;

    public static ListOperationResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOperationResponse self = new ListOperationResponse();
        return TeaModel.build(map, self);
    }

    public ListOperationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOperationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOperationResponse setBody(ListOperationResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOperationResponseBody getBody() {
        return this.body;
    }

}
