// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDataServiceGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataServiceGroupsResponseBody body;

    public static ListDataServiceGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceGroupsResponse self = new ListDataServiceGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListDataServiceGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataServiceGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataServiceGroupsResponse setBody(ListDataServiceGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataServiceGroupsResponseBody getBody() {
        return this.body;
    }

}
