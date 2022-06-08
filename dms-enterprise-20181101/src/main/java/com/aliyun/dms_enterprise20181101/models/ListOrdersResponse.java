// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListOrdersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListOrdersResponseBody body;

    public static ListOrdersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOrdersResponse self = new ListOrdersResponse();
        return TeaModel.build(map, self);
    }

    public ListOrdersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOrdersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOrdersResponse setBody(ListOrdersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOrdersResponseBody getBody() {
        return this.body;
    }

}
