// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class ListEnabledExtensionProjectsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEnabledExtensionProjectsResponseBody body;

    public static ListEnabledExtensionProjectsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEnabledExtensionProjectsResponse self = new ListEnabledExtensionProjectsResponse();
        return TeaModel.build(map, self);
    }

    public ListEnabledExtensionProjectsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEnabledExtensionProjectsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEnabledExtensionProjectsResponse setBody(ListEnabledExtensionProjectsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEnabledExtensionProjectsResponseBody getBody() {
        return this.body;
    }

}
