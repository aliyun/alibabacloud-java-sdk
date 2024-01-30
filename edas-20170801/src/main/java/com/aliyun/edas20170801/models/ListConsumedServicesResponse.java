// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListConsumedServicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListConsumedServicesResponseBody body;

    public static ListConsumedServicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConsumedServicesResponse self = new ListConsumedServicesResponse();
        return TeaModel.build(map, self);
    }

    public ListConsumedServicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListConsumedServicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListConsumedServicesResponse setBody(ListConsumedServicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListConsumedServicesResponseBody getBody() {
        return this.body;
    }

}
