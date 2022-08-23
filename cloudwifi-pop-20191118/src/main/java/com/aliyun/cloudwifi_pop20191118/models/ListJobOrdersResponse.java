// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class ListJobOrdersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListJobOrdersResponseBody body;

    public static ListJobOrdersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListJobOrdersResponse self = new ListJobOrdersResponse();
        return TeaModel.build(map, self);
    }

    public ListJobOrdersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListJobOrdersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListJobOrdersResponse setBody(ListJobOrdersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListJobOrdersResponseBody getBody() {
        return this.body;
    }

}
