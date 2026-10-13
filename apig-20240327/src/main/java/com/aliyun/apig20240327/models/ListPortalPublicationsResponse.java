// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListPortalPublicationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPortalPublicationsResponseBody body;

    public static ListPortalPublicationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPortalPublicationsResponse self = new ListPortalPublicationsResponse();
        return TeaModel.build(map, self);
    }

    public ListPortalPublicationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPortalPublicationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPortalPublicationsResponse setBody(ListPortalPublicationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPortalPublicationsResponseBody getBody() {
        return this.body;
    }

}
