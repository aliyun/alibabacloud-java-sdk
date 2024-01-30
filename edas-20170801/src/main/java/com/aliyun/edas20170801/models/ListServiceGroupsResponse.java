// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListServiceGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListServiceGroupsResponseBody body;

    public static ListServiceGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListServiceGroupsResponse self = new ListServiceGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListServiceGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListServiceGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListServiceGroupsResponse setBody(ListServiceGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListServiceGroupsResponseBody getBody() {
        return this.body;
    }

}
