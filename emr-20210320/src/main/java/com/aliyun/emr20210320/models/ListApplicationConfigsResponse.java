// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListApplicationConfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListApplicationConfigsResponseBody body;

    public static ListApplicationConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationConfigsResponse self = new ListApplicationConfigsResponse();
        return TeaModel.build(map, self);
    }

    public ListApplicationConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApplicationConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApplicationConfigsResponse setBody(ListApplicationConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApplicationConfigsResponseBody getBody() {
        return this.body;
    }

}
