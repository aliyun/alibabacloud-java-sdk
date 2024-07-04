// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListResourceHealthInspectionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListResourceHealthInspectionsResponseBody body;

    public static ListResourceHealthInspectionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourceHealthInspectionsResponse self = new ListResourceHealthInspectionsResponse();
        return TeaModel.build(map, self);
    }

    public ListResourceHealthInspectionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListResourceHealthInspectionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListResourceHealthInspectionsResponse setBody(ListResourceHealthInspectionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListResourceHealthInspectionsResponseBody getBody() {
        return this.body;
    }

}
