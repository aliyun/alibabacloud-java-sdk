// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListCustomAttributesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCustomAttributesResponseBody body;

    public static ListCustomAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCustomAttributesResponse self = new ListCustomAttributesResponse();
        return TeaModel.build(map, self);
    }

    public ListCustomAttributesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCustomAttributesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCustomAttributesResponse setBody(ListCustomAttributesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCustomAttributesResponseBody getBody() {
        return this.body;
    }

}
