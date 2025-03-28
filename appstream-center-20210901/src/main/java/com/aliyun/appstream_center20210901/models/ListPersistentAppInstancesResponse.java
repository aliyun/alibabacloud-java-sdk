// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListPersistentAppInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPersistentAppInstancesResponseBody body;

    public static ListPersistentAppInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPersistentAppInstancesResponse self = new ListPersistentAppInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListPersistentAppInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPersistentAppInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPersistentAppInstancesResponse setBody(ListPersistentAppInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPersistentAppInstancesResponseBody getBody() {
        return this.body;
    }

}
