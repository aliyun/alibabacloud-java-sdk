// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ListModelingClassificationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListModelingClassificationsResponseBody body;

    public static ListModelingClassificationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListModelingClassificationsResponse self = new ListModelingClassificationsResponse();
        return TeaModel.build(map, self);
    }

    public ListModelingClassificationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListModelingClassificationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListModelingClassificationsResponse setBody(ListModelingClassificationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListModelingClassificationsResponseBody getBody() {
        return this.body;
    }

}
