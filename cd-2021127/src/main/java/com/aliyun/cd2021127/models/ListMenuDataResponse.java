// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class ListMenuDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListMenuDataResponseBody body;

    public static ListMenuDataResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMenuDataResponse self = new ListMenuDataResponse();
        return TeaModel.build(map, self);
    }

    public ListMenuDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMenuDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMenuDataResponse setBody(ListMenuDataResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMenuDataResponseBody getBody() {
        return this.body;
    }

}
