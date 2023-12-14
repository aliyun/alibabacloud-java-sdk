// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListProjectLogStoresResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListProjectLogStoresResponseBody body;

    public static ListProjectLogStoresResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProjectLogStoresResponse self = new ListProjectLogStoresResponse();
        return TeaModel.build(map, self);
    }

    public ListProjectLogStoresResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProjectLogStoresResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProjectLogStoresResponse setBody(ListProjectLogStoresResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProjectLogStoresResponseBody getBody() {
        return this.body;
    }

}
