// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListEiamRegionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListEiamRegionsResponseBody body;

    public static ListEiamRegionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEiamRegionsResponse self = new ListEiamRegionsResponse();
        return TeaModel.build(map, self);
    }

    public ListEiamRegionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEiamRegionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEiamRegionsResponse setBody(ListEiamRegionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEiamRegionsResponseBody getBody() {
        return this.body;
    }

}
