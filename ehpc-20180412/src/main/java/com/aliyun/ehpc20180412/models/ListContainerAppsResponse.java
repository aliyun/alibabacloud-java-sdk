// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListContainerAppsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListContainerAppsResponseBody body;

    public static ListContainerAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListContainerAppsResponse self = new ListContainerAppsResponse();
        return TeaModel.build(map, self);
    }

    public ListContainerAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListContainerAppsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListContainerAppsResponse setBody(ListContainerAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListContainerAppsResponseBody getBody() {
        return this.body;
    }

}
