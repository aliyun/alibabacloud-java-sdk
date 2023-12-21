// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListEiamInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListEiamInstancesResponseBody body;

    public static ListEiamInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEiamInstancesResponse self = new ListEiamInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListEiamInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEiamInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEiamInstancesResponse setBody(ListEiamInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEiamInstancesResponseBody getBody() {
        return this.body;
    }

}
