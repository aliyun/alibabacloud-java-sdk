// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDataServiceApiAuthoritiesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListDataServiceApiAuthoritiesResponseBody body;

    public static ListDataServiceApiAuthoritiesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceApiAuthoritiesResponse self = new ListDataServiceApiAuthoritiesResponse();
        return TeaModel.build(map, self);
    }

    public ListDataServiceApiAuthoritiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataServiceApiAuthoritiesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataServiceApiAuthoritiesResponse setBody(ListDataServiceApiAuthoritiesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataServiceApiAuthoritiesResponseBody getBody() {
        return this.body;
    }

}
