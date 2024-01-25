// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListServiceContainersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListServiceContainersResponseBody body;

    public static ListServiceContainersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListServiceContainersResponse self = new ListServiceContainersResponse();
        return TeaModel.build(map, self);
    }

    public ListServiceContainersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListServiceContainersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListServiceContainersResponse setBody(ListServiceContainersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListServiceContainersResponseBody getBody() {
        return this.body;
    }

}
