// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListEnabledExtensionsForProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEnabledExtensionsForProjectResponseBody body;

    public static ListEnabledExtensionsForProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEnabledExtensionsForProjectResponse self = new ListEnabledExtensionsForProjectResponse();
        return TeaModel.build(map, self);
    }

    public ListEnabledExtensionsForProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEnabledExtensionsForProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEnabledExtensionsForProjectResponse setBody(ListEnabledExtensionsForProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEnabledExtensionsForProjectResponseBody getBody() {
        return this.body;
    }

}
